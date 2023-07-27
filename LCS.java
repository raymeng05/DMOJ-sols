import java.util.*;
import java.io.*;
public class LCS {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        final int length = 3002;
        String a = readLine();
        String b = readLine();
        int aSize = a.length();
        int bSize = b.length();
        int[][] dp = new int[length][length];
        for(int i = 1; i<=a.length(); i++){
            for(int j = 1; j<=bSize; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[j-1][i]);
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