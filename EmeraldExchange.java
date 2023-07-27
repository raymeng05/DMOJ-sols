import java.util.*;
import java.io.*;
public class EmeraldExchange {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        int maxSum = -1;
        int curSum = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2 == 0){
                curSum += arr[i];
            } else {
                if(curSum > maxSum){
                    maxSum = curSum;
                }
                curSum = 0;
            }
        }
        if(curSum > maxSum){
            maxSum = curSum;
        }
        System.out.println(maxSum);
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