import java.util.*;
import java.io.*;
public class BirthdayGame {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static ArrayList<Integer>[] adj;
    public static void main(String[] args) throws IOException{
        n = readInt();
        adj = new ArrayList[n+1];
        int[] inDegree = new int[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<=n; i++){
            int x = readInt();
            adj[i].add(x);
            inDegree[x]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int nxt:adj[cur]){
                inDegree[nxt]--;
                if(inDegree[nxt] == 0){
                    q.add(nxt);
                }
            }
        }
        int counter = 0;
        for(int i = 1; i<=n; i++){
            if(inDegree[i] != 0){
                counter++;
            }
        }
        System.out.println(counter);


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





