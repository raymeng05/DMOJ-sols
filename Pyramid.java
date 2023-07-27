import java.util.*;
import java.io.*;
public class Pyramid {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        int cur = 1;
        for(int i = 0, j = n-1; i < j;){
            if(arr[i] == cur && arr[j] == cur){
                cur++;
            }

            if(arr[j] != cur){
                j--;
            }
            if(arr[i] != cur){
                i++;
            }
        }
        int output = cur-1;

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