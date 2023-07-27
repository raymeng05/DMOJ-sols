import java.util.*;
import java.io.*;
public class NetWeight {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            int weight = readInt();
            if(weight <= 100){
                arr[i] = weight;
            }
        }
        Arrays.sort(arr);
        if(n == 1){
            if(arr[0] > 100){
                System.out.println(0);
            } else {
                System.out.println(arr[0]);
            }
        } else {
            System.out.print(arr[n - 1] + arr[n - 2]);
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