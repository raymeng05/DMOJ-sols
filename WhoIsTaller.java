import java.util.*;
import java.io.*;
public class WhoIsTaller {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i<m; i++){
            int x = readInt();
            int y = readInt();
            adj[x].add(y);
        }
        int p = readInt();
        int q = readInt();

        boolean unknown = true;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[n+1];
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int nxt:adj[cur]){
                if(!vis[nxt]){
                    vis[nxt] = true;
                    queue.add(nxt);
                }
            }
            if(vis[p]){
                unknown = false;
                System.out.println("no");
                break;
            }
            if(vis[q]){
                unknown = false;
                System.out.println("yes");
                break;
            }
        }
        if(unknown){
           System.out.println("unknown");
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