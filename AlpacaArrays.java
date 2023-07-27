import java.util.*;
import java.io.*;
public class AlpacaArrays {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int[] arr;
    static boolean check(int l, int r, int x){
        for(int i = l; i<=r; i++){
            if(x%arr[i] != 0){
                continue;
            }
            int k = x/arr[i];
            int index = Arrays.binarySearch(arr, l, r, k);
            if(index >= 0 && arr[index] != arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int q = readInt();
        arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        for(int i = 0; i<q; i++){
            int l = readInt()-1;
            int r  = readInt()-1;
            int x = readInt();
            boolean a = check(l, r, x);
            if(a){
                System.out.println("YES");
            } else {
                System.out.println("NO");
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