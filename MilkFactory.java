import java.util.*;
import java.io.*;
public class MilkFactory {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static ArrayList<Integer>[] adj;
    static int bfs(int start){
        boolean[] visited = new boolean[n+1];
        int[] dist = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int nxt:adj[cur]){
                if(!visited[nxt]){
                    dist[nxt] = dist[cur] + 1;
                    visited[nxt] = true;
                    q.add(nxt);
                }
            }
        }
        int maxIndex = 1;
        for(int i = 1; i<n+1; i++){
            if(dist[i] > dist[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) throws IOException {
        n = readInt();
        adj = new ArrayList[n+1];
        for(int i = 1; i<n+1; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<n; i++){
            int x = readInt();
            int y = readInt();
            adj[x].add(y);
        }
        int farthestNode = bfs(1);
        int output = farthestNode;
        int countI = 0;
        for(int i = 2; i<n+1; i++){
            int farthestPoint = bfs(i);
            if(farthestPoint != farthestNode){
                countI++;
                if(countI > 1) {
                    output = -1;
                    break;
                }
            }
        }
        System.out.println(output);



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