import java.util.*;
import java.io.*;
public class WorldOfStarCraft {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int[] parent;
    static int findParent(int p){
        if(p != parent[p]){
            parent[p] = findParent(parent[p]);
        }
        return parent[p];
    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        int k = readInt();
        parent = new int[n+1];
        char[] planetType = new char[n+1];
        String s = readLine();
        for(int i = 0; i<n; i++){
            planetType[i+1] = s.charAt(i);
        }
        for(int i = 1; i<=n; i++){
            parent[i] = i;
        }
        for(int i = 0; i<m; i++){
            int a = readInt();
            int b = readInt();
            int rootA = findParent(a);
            int rootB = findParent(b);
            if(rootA != rootB && planetType[rootA] == planetType[rootB]){
                parent[rootB] = rootA;
            }
        }
        int counter = 0;
        for(int i = 0; i<k; i++){
            int x = readInt();
            int y = readInt();
            int rootX = findParent(x);
            int rootY = findParent(y);
            if(rootX == rootY){
                counter++;
            }
        }
        System.out.println(counter);

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





