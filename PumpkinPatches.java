import java.util.*;
import java.io.*;

public class PumpkinPatches {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numPumpkins = readInt();
        int[] x = new int[numPumpkins];
        int[] y = new int[numPumpkins];
        for(int i = 0; i<numPumpkins; i++){
            x[i] = readInt();
            y[i] = readInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int maxXDiff = x[numPumpkins-1] - x[0];
        int maxYDiff = y[numPumpkins-1] - y[0];

        System.out.println((maxXDiff + maxYDiff)*2);
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











