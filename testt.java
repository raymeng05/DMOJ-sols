import java.util.*;
import java.io.*;
public class testt {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        for(int i = 0; i<n; i++){
            String input = readLine();
            int length = input.length();
            String output = "";
            int maxLen = 1;
            for(int j = 0; j<length; j++){
                for(int k = j+1; k<length; k++) {
                    String substr = input.substring(j, k+1);
                    StringBuilder temp = new StringBuilder(substr);
                    String reverse = temp.reverse().toString();
                    if(substr.equals(reverse) && maxLen<substr.length()){
                        maxLen = substr.length();
                        output = substr;
                    }
                }
            }
            System.out.println(output);
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