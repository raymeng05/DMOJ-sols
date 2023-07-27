import java.util.*;
import java.io.*;
public class Deforestation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numTrees = readInt();
        int[] arr = new int[numTrees+1];
        int[] psa = new int[numTrees+1];
        psa[0] = 0;
        for(int i = 1; i<=numTrees; i++){
            arr[i] = readInt();
            psa[i] = arr[i] + psa[i-1];
        }
        int numQueries = readInt();
        for(int i = 0; i<numQueries; i++){
            int a = readInt();
            int b = readInt()+1;
            System.out.println(psa[b]-psa[a]);
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












