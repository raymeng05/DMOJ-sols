import java.math.BigDecimal;
import java.util.*;
import java.io.*;
public class VoronoiVillages {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
       int n = readInt();
       double[] arr = new double[n];
       for(int i = 0; i<n; i++){
           arr[i] = readDouble();
       }
       Arrays.sort(arr);
       double smallest = Integer.MAX_VALUE;
       for(int i = 1; i<n-1; i++){
           double rightmost = (arr[i+1]-arr[i])/2;
           double leftmost = (arr[i]-arr[i-1])/2;
           smallest = Math.min(Math.abs(rightmost+leftmost), smallest);
       }

       String val = BigDecimal.valueOf(smallest).toPlainString();
        if(val.charAt(val.length()-2) != '.'){
            String kek = val + ".0";
            System.out.print(kek);
        } else {
            System.out.print(val);
        }



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