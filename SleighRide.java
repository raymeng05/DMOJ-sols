import java.util.*;
import java.io.*;
public class SleighRide {
    static class edge{
        int v;
        int w;
        public edge(int v, int w){
            this.v = v;
            this.w = w;
        }
    }
    static void dfs(int cur, int previous, int dist){
        if(dist>maxLength){
            maxLength = dist;
        }
        for(edge e : adj[cur]){
            int vertex = e.v;
            int weight = e.w;
            if(vertex != previous){
                dfs(vertex, cur, dist+weight);
            }
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static int maxLength = 0;
    static List<edge> adj[];
    public static void main(String[] args) throws IOException {
        n = readInt();
        adj = new ArrayList[n+1];
        for(int i = 0; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        int totalWeight = 0;
        for(int i = 1; i<=n; i++){
            int a = readInt();
            int b = readInt();
            int weight = readInt();
            totalWeight += weight;
            adj[a].add(new edge(b, weight));
            adj[b].add(new edge(a, weight));
        }
        dfs(0, -1, 0);
        System.out.println(2*totalWeight - maxLength);
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





