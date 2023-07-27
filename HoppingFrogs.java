import java.util.*;
import java.io.*;

public class HoppingFrogs {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        int[] dist = new int[n+m+1];
        boolean[] visited= new boolean[n+m+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<m+n+1; i++){
            if(i != n){
                q.add(i);
                visited[i] = true;
            }
        }
        while(!q.isEmpty()){
            int cur = q.poll();

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
