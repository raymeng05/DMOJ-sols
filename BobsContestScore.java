import java.util.*;
import java.io.*;
public class BobsContestScore {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numQuestions = readInt();
        int[] arr = new int[numQuestions];
        int[] preSum = new int[numQuestions];
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i<numQuestions; i++){
            arr[i] = readInt();
        }
        preSum[0] = arr[0];
        for(int i = 1; i<numQuestions; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }
        for(int k = 0; k<numQuestions; k++){
            System.out.println(preSum[k]);
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
