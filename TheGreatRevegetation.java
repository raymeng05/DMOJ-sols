import java.util.*;
import java.io.*;
public class TheGreatRevegetation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static int m;
    static ArrayList<Integer>[] adj;
    public static void main(String[] args) throws IOException {
        n = readInt();
        m = readInt();
        adj = new ArrayList[m+1];
        for(int i = 1; i<=m; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<=m; i++){
            int x = readInt();
            int y = readInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        int cur  = 1;
        int curVal = 1;
        int[] arr = new int[n+1];
        for(int i = 1; i<=n; i++){
            if(i == 1){
                arr[i] = 1;
                continue;
            }
            for(int j = i; j<=n; j++) {
                if (adj[cur].contains(i)) {
                    
                }
            }


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