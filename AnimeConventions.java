import java.util.*;
import java.io.*;
public class AnimeConventions {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int numCities;
    static int[] parent;
    static int[] rank;
    static int findRoot(int p){
        if(p != parent[p]){
            parent[p] = findRoot(parent[p]);
        }
        return parent[p];
    }

    static void unify(int x, int y){
        if(findRoot(x) == findRoot(y)){
            return;
        }
        int rootX = findRoot(x);
        int rootY = findRoot(y);
        if(rank[rootX] > rank[rootY]){
            parent[rootY] = rootX;
        } else {
            parent[rootX] = rootY;
        }
        if(rank[rootX] == rank[rootY]){
            rank[rootY]++;
        }
    }
    public static void main(String[] args) throws IOException {
        numCities = readInt();
        parent = new int[numCities+1];
        rank = new int[numCities+1];
        for(int i = 1; i<numCities+1; i++){
            parent[i] = i;
            rank[i] = 0;
        }
        int numQueries = readInt();
        for(int i = 0; i<numQueries; i++){
            char a = readCharacter();
            int x = readInt();
            int y = readInt();
            if(a == 'A'){
                unify(x, y);
            } else {
                boolean isConnected = findRoot(x) == findRoot(y);
                if(isConnected){
                    System.out.println("Y");
                } else {
                    System.out.println("N");
                }
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