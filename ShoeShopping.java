import java.util.*;
import java.io.*;
public class ShoeShopping {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        Double[] arr = new Double[n];
        double sum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = readDouble();
            sum += arr[i];
        }
        double max = -1;
        for(int i = 0; i<n-2; i++){
            double first = arr[i];
            double second = arr[i+1];
            double third = arr[i+2];
            if(first <= second && first <= third){
                max = Math.max(first/2, max);
                max = Math.max(first, max);
            } else if(second <= first && second <= third){
                max = Math.max(second/2, max);
                max = Math.max(second, max);
            } else if(third <= second && third <= first){
                max = Math.max(third, max);

            }
        }
        if(arr[n-2]<arr[n-1]){
            max = Math.max(max, arr[n-2]/2);
        } else {
            max = Math.max(arr[n-1]/2, max);
        }
        System.out.println(max);
        System.out.println(sum);
        System.out.println(sum-max);

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