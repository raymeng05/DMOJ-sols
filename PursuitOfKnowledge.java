import java.util.*;
import java.io.*;
public class PursuitOfKnowledge {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, m, t;
    static List<Integer> arr[];
    static int dist[][];

    static void bfs(int[] dis, int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        dis[i] = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int nxt : arr[cur]) {
                if(dis[nxt] == -1){
                    q.add(nxt);
                    dis[nxt] = dis[cur] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        n = readInt();
        m = readInt();
        t = readInt();
        dist = new int[n+1][n+1];
        arr = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
            Arrays.fill(dist[i], -1);
        }
        for (int i = 0; i < m; i++) {
            int x = readInt();
            int y = readInt();
            arr[x].add(y);
        }
        for(int i = 1; i<=n; i++){
            bfs(dist[i], i);
        }

        int numQueries = readInt();
        for (int i = 0; i < numQueries; i++) {
            int a = readInt();
            int b = readInt();
            if(dist[a][b] != -1){
                System.out.println(dist[a][b]*t);
            } else {
                System.out.println("Not enough hallways!");
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