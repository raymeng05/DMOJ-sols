import java.util.*;
import java.io.*;
public class BirthdayGame2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static ArrayList<Integer>[] adj;
    static int minCycle;
    static void dfs(int start, boolean[] visited, int[] dist){
        visited[start] = true;
        for(int nxt: adj[start]){
            if(!visited[nxt]) {
                dist[nxt] = dist[start]+1;
                dfs(nxt, visited, dist);
            } else {
                minCycle = Math.min(minCycle, Math.abs(dist[start]-dist[nxt])+1);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        n = readInt();
        adj = new ArrayList[n+1];
        minCycle = n;
        int[] inDegree = new int[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<=n; i++){
            int x = readInt();
            adj[i].add(x);
            inDegree[x]++;
        }
        for(int i = 1; i<=n; i++){
            if(inDegree[i] == 0){
                int[] dist = new int[n+1];
                boolean[] visited = new boolean[n+1];
                dfs(i, visited, dist);
            }
        }
        System.out.println(minCycle);

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





