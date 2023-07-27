import java.util.*;
import java.io.*;
public class ANoisyClass {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numStudents = readInt();
        int numEdges = readInt();
        ArrayList<Integer>[] arr = new ArrayList[numStudents+1];
        int[] inDegree = new int[numStudents+1];
        for(int i = 0; i<numStudents+1; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i<numEdges; i++){
            int x = readInt();
            int y = readInt();
            arr[x].add(y);
            inDegree[y]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<numStudents+1; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        int counter = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            counter++;
            for(int nxt:arr[cur]){
                inDegree[nxt]--;
                if(inDegree[nxt] == 0){
                    q.add(nxt);
                }
            }
        }
        if(counter == numStudents){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}









