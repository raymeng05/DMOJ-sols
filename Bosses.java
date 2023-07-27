import java.util.*;
import java.io.*;
public class Bosses {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numLevels = readInt();
        int secsGainOneUnit = readInt();
        int potionNumSecs = readInt();
        int[] arr = new int[numLevels];
        int[] psa = new int[numLevels];
        arr[0] = readInt();
        psa[0] = arr[0];
        for(int i = 1; i<numLevels; i++){
            arr[i] = readInt();
            psa[i] = psa[i-1] + arr[i];
        }
        

        int totalPower = 0;
        int totalSecs = 0;


        System.out.println(totalSecs);


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









