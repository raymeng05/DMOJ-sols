import java.util.*;
import java.io.*;
public class CanShahirEvenGetThere {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;


    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int m = readInt();
        int start = readInt();
        int target = readInt();

        ArrayList<Integer>[] arr = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i<m; i++){
            int u = readInt();
            int v = readInt();
            arr[u].add(v);
            arr[v].add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n+1];
        vis[start] = true;
        q.add(start);

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int nxt:arr[cur]){
                if(!vis[nxt]){
                    vis[nxt] = true;
                    q.add(nxt);
                }
            }
        }
        if(vis[target]){
            System.out.println("GO SHAHIR!");
        } else {
            System.out.println("NO SHAHIR!");
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