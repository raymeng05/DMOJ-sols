import java.util.*;
import java.io.*;
public class NewComponents {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static int numConnectedComponents;
    static int[] connectedComp;
    static ArrayList<Integer>[] adj;
    static boolean[] vis;

    static void bfs(int start, Queue<Integer> q){
        vis[start] = true;
        q.add(start);
        while(!q.isEmpty()){
            int cur = q.poll();
            connectedComp[cur] = numConnectedComponents+1;
            for(int nxt:adj[cur]){
                if(!vis[nxt]){
                    vis[nxt] = true;
                    q.add(nxt);
                }
            }
        }
    }
    public static void main(String args[]) throws IOException  {
        n = readInt();
        int[] arr = new int[n+1];
        numConnectedComponents = 0;
        connectedComp = new int[n+1];
        adj = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<=n; i++){
            arr[i] = readInt();
            adj[i].add(arr[i]);
            adj[arr[i]].add(i);
        }
        vis = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            if(!vis[i]){
                bfs(i, q);
            }
        }

    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
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