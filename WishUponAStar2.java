import java.util.*;
import java.io.*;
public class WishUponAStar2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int numNodes;
    static int[] parent;
    static int findRoot(int x){
        if(parent[x] != x){
            parent[x] = findRoot(parent[x]);
        }
        return parent[x];
    }
    public static void main(String[] args) throws IOException {
        numNodes = readInt();
        int numEdges = readInt();
        int countCycles = 0;
        parent = new int[numNodes+1];
        for(int i = 1; i<=numNodes; i++){
            parent[i] = i;
        }
        boolean canRestore = true;
        for(int i = 0; i<numEdges; i++){
            int a = readInt();
            int b = readInt();
            int rootA = findRoot(a);
            int rootB = findRoot(b);
            if(rootA != rootB){
                parent[rootB] = rootA;
            } else {
                countCycles++;
            }
            if(countCycles>1){
                canRestore = false;
                break;
            }
        }
        if(canRestore){
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