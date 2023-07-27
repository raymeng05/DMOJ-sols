import java.util.*;
import java.io.*;
public class PalindromicNumbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        long l = readLong();
        long r = readLong();
        long counter = 0;
        for(; l<=r; l++){
            String thing = String.valueOf(l);
            boolean a = true;
            for(int i = 0, j = thing.length()-1; i<=j; i++, j--){
                if(thing.charAt(i) != thing.charAt(j)){
                    a = false;
                    break;
                }
            }
            if(a) {
                counter++;
            }
        }
        System.out.println(counter);
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