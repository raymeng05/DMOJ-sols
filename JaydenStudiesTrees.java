import java.util.*;
import java.io.*;
public class JaydenStudiesTrees {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static int bfs(List<Integer> adj[]){
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[n+1];
        boolean[] visited = new boolean[n+1];
        q.add(1);
        visited[1] = true;
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int nxt: adj[cur]){
                if(!visited[nxt]) {
                    q.add(nxt);
                    visited[nxt] = true;
                    dist[nxt] = dist[cur] + 1;
                }
            }
        }
        int maxIndex = 0;
        for(int i = 1; i<n+1; i++){
            if(dist[i] > dist[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) throws IOException {
        n = readInt();
        List<Integer> adj[] = new ArrayList[n+1];
        for(int i = 0; i<n+1; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<n; i++){
            int a = readInt();
            int b = readInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        int endpoint = bfs(adj);
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[n+1];
        boolean[] visited = new boolean[n+1];
        q.add(endpoint);
        visited[endpoint] = true;
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int nxt: adj[cur]){
                if(!visited[nxt]) {
                    q.add(nxt);
                    visited[nxt] = true;
                    dist[nxt] = dist[cur] + 1;
                }
            }
        }
        int max = 0;
        for(int i = 1; i<n+1; i++){
            if(dist[i] > max){
                max = dist[i];
            }
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





