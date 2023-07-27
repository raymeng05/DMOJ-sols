import java.util.*;
import java.io.*;
public class BobsShufflingSequence {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        long output = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        Arrays.sort(arr);
        for(int L = 0, R = n-1; L<n/2-1; L++, R--) {
            output += arr[R] * 2 - arr[L] * 2;
        }
            if(n%2 == 0){
                output += arr[n/2] - arr[n/2-1];
            } else {
                int a = arr[n/2-1];
                int b = arr[n/2];
                int c = arr[n/2+1];
                output += Math.max(2*c-b-a, c+b-a*2);
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





