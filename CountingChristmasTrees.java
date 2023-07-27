import java.util.*;
import java.io.*;
public class CountingChristmasTrees {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        int maxIncreaseL = 0;
        int tempIncrease = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]>arr[i-1]){
                tempIncrease++;
            } else {
                maxIncreaseL = Math.max(tempIncrease, maxIncreaseL);
                tempIncrease = 0;
            }
            if(i == n-1){
                maxIncreaseL = Math.max(tempIncrease, maxIncreaseL);
            }
        }

        int maxDecreaseL = 0;
        int tempDecrease = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]<arr[i-1]){
                tempDecrease++;
            } else {
                maxDecreaseL = Math.max(tempDecrease, maxDecreaseL);
                tempDecrease = 0;
            }
            if(i == n-1){
                maxDecreaseL = Math.max(tempDecrease, maxDecreaseL);
            }
        }
        System.out.println(maxIncreaseL+1);
        System.out.println(maxDecreaseL+1);
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