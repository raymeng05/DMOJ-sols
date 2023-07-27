import java.util.*;
import java.io.*;
public class TravellingSalesman {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numCities = readInt();
        int numRoads = readInt();
        List<Integer> adj [] = new ArrayList[numCities+1];
        for(int i = 1; i<adj.length; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i<numRoads; i++){
            int a = readInt();
            int b = readInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        int k = readInt();
        Queue<Integer> q = new LinkedList<>();
        int[] dis = new int[numCities+1];
        boolean[] vis = new boolean[numCities+1];
        for(int i = 0; i<k; i++){
            int n = readInt();
            q.add(n);
            vis[n] = true;
        }
        int distance = 0;
        while(!q.isEmpty()){
            boolean a = false;
            int cur = q.poll();
            for(int nxt: adj[cur]){
                if(!vis[nxt]) {
                    q.add(nxt);
                    vis[nxt] = true;
                    dis[nxt] = dis[cur] + 1;
                    a = true;
                }
            }
            if(a) {
                distance = dis[cur] + 1;
            } else {
                distance = dis[cur];
            }
        }
        System.out.println(distance);


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




