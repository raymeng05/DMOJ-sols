import java.util.*;
import java.io.*;
public class MaxFlow {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numScenarios = readInt();
        for(int i = 0; i<numScenarios; i++){
            int numFlows = readInt();
            int[] arr = new int[numFlows];
            for(int j = 0; j<numFlows; j++){
                arr[j] = readInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[numFlows-1]);
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

