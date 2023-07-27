import java.util.*;
import java.io.*;
public class MultipleOfThree {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        for(int i = 0; i<n; i++){
            String s = readLine();
            int sumDigits = 0;
            for(int j = 0; j<s.length(); j++){
                sumDigits += Integer.parseInt(s.substring(j, j+1));
            }
            if(sumDigits%3 == 0){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
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