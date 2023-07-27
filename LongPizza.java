import java.util.*;
import java.io.*;
public class LongPizza {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int x = readInt();
        int y = readInt();
        int[] arr = new int[n+1];

        int numQ = readInt();

        for(int i = 0; i<numQ; i++){
            int l = readInt();
            int r = readInt();
            arr[l]++;
            arr[r+1]--;
        }
        long[] newArr = new long[n+1];
        for(int i = 1; i<=n; i++){
            newArr[i] = newArr[i-1] + arr[i];
        }
        long output = 0;
        for(int i = x; i<=y; i++){
            output += newArr[i];
        }
        System.out.println(output);
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