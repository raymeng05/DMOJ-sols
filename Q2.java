import java.util.*;
import java.io.*;
public class Q2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        int sumOf = 0;
        for (int i = 0; i<n; i++) {
            sumOf += arr[i];
        }
        int limitThing = 2*sumOf+1;

        int dp[][] = new int[n+1][limitThing];

        for(int i = 0; i < n + 1; i++) {
            for (int j = 0; j < limitThing; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
            dp[0][sumOf] = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j<limitThing; j++) {
                    if ((j - arr[i-1]) >= 0 && dp[i-1][j-arr[i-1]] != Integer.MIN_VALUE) {
                        dp[i][j] = Math.max(dp[i][j], dp[i-1][j - arr[i-1]] + arr[i-1]);
                    }
                    if ((j + arr[i - 1]) < limitThing && dp[i-1][j + arr[i - 1]] != Integer.MIN_VALUE) {
                        dp[i][j] = Math.max(dp[i][j], dp[i-1][j + arr[i-1]]);
                    }

                    if (dp[i-1][j] != Integer.MIN_VALUE) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                    }
                }
            }
            System.out.println(dp[n][sumOf]);
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