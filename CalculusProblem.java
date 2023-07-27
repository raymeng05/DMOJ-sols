import java.util.*;
import java.io.*;
public class CalculusProblem {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int q = readInt();
        int[] points = new int[n];
        int[] copy = new int[n];
        Map<Integer, Set<Integer>> ind = new HashMap<>();
        for(int i = 0; i<n; i++){
            points[i] = readInt();
            copy[i] = points[i];
            
        }
        Arrays.sort(copy);

        for(int i = 0; i<n+1; i++){
            System.out.println(points[i]);
        }
        for(int i = 0; i<q; i++){
            int m = readInt();
            int k = readInt();
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
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