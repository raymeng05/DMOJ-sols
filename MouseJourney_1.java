import java.util.*;
import java.io.*;
public class MouseJourney {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class pair{
        int r;
        int c;

        public pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String args[]) throws IOException  {
        int r = readInt();
        int c = readInt();
        int[][] dp = new int[r+1][c+1];
        int numCats = readInt();
        for(int i = 0; i<numCats; i++){
            int row = readInt();
            int col = readInt();
            dp[row][col] = -1;
        }
        dp[1][1] = 1;
        for(int i = 1; i<=r; i++){
            for(int j = 1; j<=c; j++){
                if(dp[i][j] == -1){
                    continue;
                }
                if(j>1 && dp[i][j-1] != -1){
                    dp[i][j] += dp[i][j-1];
                }
                if(i > 1 && dp[i-1][j] != -1){
                    dp[i][j] += dp[i-1][j];
                }
            }
        }
        System.out.println(dp[r][c]);
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