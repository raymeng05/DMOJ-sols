import java.util.*;
import java.io.*;
public class SleepyCowHerding {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int cow1 = readInt();
        int cow2 = readInt();
        int cow3 = readInt();
        int rsDiff = cow3-cow2;
        int lsDiff = cow2-cow1;
        if(rsDiff == 2 || lsDiff == 2){
            System.out.println(1);
        } else if(rsDiff == 1 && lsDiff == 1){
            System.out.println(0);
        } else {
            System.out.println(2);
        }
        int maxDiff = Math.max(rsDiff, lsDiff);
        System.out.println(maxDiff-1);

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





