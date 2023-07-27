import java.util.*;
import java.io.*;
public class ExecPieing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int t = readInt();
        int[] arr = new int[n];
        int[] max = new int[n];
        int[] psa = new int[n];
        arr[0] = readInt();
        max[0] = arr[0];
        psa[0] = arr[0];
        int curMax = max[0];
        for(int i = 1; i<n; i++){
            arr[i] = readInt();
            psa[i] = psa[i-1]+arr[i];
            if(arr[i] > curMax){
                curMax = arr[i];
                max[i] = curMax;
            } else {
                max[i] = curMax;
            }
        }
        int ans = 0;
        for(int i = n-1; i>=0; i--){
            if(psa[i]-max[i] <= t){
                ans = i;
                break;
            }
        }
        System.out.println(ans);

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