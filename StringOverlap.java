import java.util.*;
import java.io.*;
public class StringOverlap {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        String a = next();
        String b = next();
        int aLength = a.length();
        int bLength = b.length();

        int maxL1 = 0;
        int maxL2 = 0;
        for(int i = aLength; i>0; i--){
            if(b.endsWith(a.substring(0, i))){
                maxL1 = i;
                break;
            }
        }
        for(int i = bLength; i>0; i--){
            if(a.endsWith(b.substring(0, i))){
                maxL2 = i;
            }
        }
        System.out.println(Math.max(maxL1, maxL2));
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