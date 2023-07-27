import java.util.*;
import java.io.*;
public class MeetingDay {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static ArrayList<edge>[] adj;
    static int[][] dist;
    static void djistkra(int start){
        PriorityQueue<edge> q = new PriorityQueue<>();
        boolean[] vis = new boolean[n+1];
        dist[start][start] = 0;
        q.add(new edge(start, 0));
        while(!q.isEmpty()){
            edge cur = q.poll();
            int curNode = cur.u;
            int distance = cur.w;
            if(vis[curNode]){
                continue;
            }
            vis[curNode] = true;
            for(edge e: adj[curNode]){
                int node = e.u;
                int weight = e.w;
                if(dist[start][node] > dist[start][curNode] + weight){
                    dist[start][node] = dist[start][curNode] + weight;
                    q.add(new edge(node, dist[start][node]));
                }
            }
        }
    }
    static class edge implements Comparable <edge>{
        int u;
        int w;
        public edge(int u, int w){
            this.u = u;
            this.w = w;
        }
        public int compareTo(edge y){
            return Integer.compare(w, y.w);
        }
    }
    public static void main(String[] args) throws IOException {
        n = readInt();
        int m = readInt();
        int x = readInt();
        adj = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i<m; i++){
            int u = readInt();
            int v = readInt();
            int w = readInt();
            adj[u].add(new edge(v, w));
        }
        dist = new int[n+1][n+1];
        for(int i = 1; i<=n; i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        djistkra(x);
        for(int i = 1; i<=n; i++){
            if(i == x){
                continue;
            }
            djistkra(i);
        }
        /*for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }*/
        int max = -1;
        for(int i = 1; i<=n; i++){
            if(i == x){
                continue;
            }
            max = Math.max(max, dist[i][x] + dist[x][i]);
        }
        System.out.println(max);
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