import java.util.*;
import java.io.*;
public class ShopAndShip {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class pair{
        int city;
        int price;
        public pair(int x, int y){
            city = x;
            price = y;
        }
    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        int[][] adj = new int[n+1][n+1];
        for(int i = 1; i<=n; i++){
            Arrays.fill(adj[i], (int)1e9);
        }
        for (int i = 0; i < m; i++) {
            int x = readInt();
            int y = readInt();
            int w = readInt();
            adj[x][y] = w;
            adj[y][x] = w;
        }
        int k = readInt();
        pair[] holder = new pair[k];
        for (int i = 0; i < k; i++) {
            int city = readInt();
            int price = readInt();
            holder[i] = new pair(city, price);
        }

        int rootCity = readInt();
        int[] dist = new int[n + 1];
        boolean[] vis = new boolean[n + 1];
        Arrays.fill(dist, (int)1e9);
        dist[rootCity] = 0;
       for(int i = 1; i<=n; i++){
           int u = -1;
           int min = (int)1e9;
           for(int j = 1; j<=n; j++){
               if(!vis[j] && dist[j]<min){
                   min = dist[j];
                   u = j;
               }
           }
           if(u == -1){
               break;
           }
           vis[u] = true;
           for(int v = 1; v<=n; v++){
               if(!vis[v] && dist[v] > dist[u] + adj[u][v]){
                   dist[v] = dist[u] + adj[u][v];
               }
           }
       }
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            int city = holder[i].city;
            int pencilPrice = holder[i].price;
            minCost = Math.min(minCost, dist[city] + pencilPrice);
        }
        System.out.println(minCost);

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