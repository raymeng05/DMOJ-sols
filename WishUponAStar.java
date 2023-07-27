import java.util.*;
import java.io.*;
public class WishUponAStar {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int numNodes;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static void DFS(int start){
        visited[start] = true;
        for(int nxt: adj[start]){
            if(!visited[nxt]){
                DFS(nxt);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        numNodes = readInt();
        int numEdges = readInt();
        int countConnected = 0;
        adj = new ArrayList[numNodes+1];
        visited = new boolean[numNodes+1];
        for(int i = 1; i<=numNodes; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i<numEdges; i++){
            int x = readInt();
            int y = readInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        for(int i = 1; i<=numNodes; i++){
            if(!visited[i]){
                countConnected++;
                DFS(i);
            }
        }
        if(numEdges == (numNodes-countConnected) || numEdges == (numNodes-countConnected+1)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
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