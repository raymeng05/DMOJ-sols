import java.util.*;
import java.io.*;
public class LandScaping {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int m = readInt();
        int n = readInt();
        int[] arr = new int[n+1];
        int numObst = 0;
        for(int i = 1; i<=n; i++){
            arr[i] = readInt();
            if(arr[i] == 0){
                numObst++;
            }
        }
        int sum = 0;
        int[] dp = new int[n+1];
        dp[0] = 1;
        sum += 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
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