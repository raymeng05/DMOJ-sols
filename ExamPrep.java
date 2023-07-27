import java.util.*;
import java.io.*;
public class ExamPrep {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int numPeople;
    static long[] numPages;
    static int[] parent;
    static int[] size;
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
            size[rootX] += size[rootY];
            numPages[rootX] += numPages[rootY];
        } else {
            parent[rootX] = rootY;
            size[rootY] += size[rootX];
            numPages[rootY] += numPages[rootX];
        }
        if(rank[rootX] == rank[rootY]){
            rank[rootY]++;
        }
    }

    public static void main(String[] args) throws IOException {
        numPeople = readInt();
        int numQueries = readInt();
        numPages = new long[numPeople+1];
        size = new int[numPeople+1];
        rank = new int[numPeople+1];
        parent = new int[numPeople+1];
        for(int i = 1; i<=numPeople; i++){
            size[i] = 1;
            parent[i] = i;
            numPages[i] = readLong();
            rank[i] = 0;
        }
        for(int i = 0; i<numQueries; i++){
            int thing = readInt();
            if(thing == 1){
                int x = readInt();
                int y = readInt();
                unify(x, y);
            } else if(thing == 2){
                int x = readInt();
                int root = findRoot(x);
                System.out.println(size[root]);
            } else {
                int x = readInt();
                int root = findRoot(x);
                System.out.println(numPages[root]);
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