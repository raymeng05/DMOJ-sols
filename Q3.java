import java.util.*;
import java.io.*;
public class Q3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numRoads = readInt();
        int numFireworks = readInt();
        int distPerSec = readInt();
        int prevTime = 1;
        for(int i = 0; i<numFireworks; i++){
            int a = readInt();
            int b = readInt();
            int t = readInt();
            int diffTime = t-prevTime;
            int maxRoadDiff = diffTime*distPerSec;
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