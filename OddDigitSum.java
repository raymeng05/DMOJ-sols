import java.util.*;
import java.io.*;
public class OddDigitSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int max = 0;
        for(int i = 0; i<n;i++){
            String s = readLine();
            int thing = 0;
            for(int j = 0; j<s.length();j++){
                if(Integer.parseInt(String.valueOf(s.charAt(j)))%2==1){
                    thing += Integer.parseInt(String.valueOf(s.charAt(j)));
                }
            }
            max = Math.max(max,thing);
        }

        System.out.println(max);
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