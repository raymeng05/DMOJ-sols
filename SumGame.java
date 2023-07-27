import java.util.*;
import java.io.*;
public class SumGame {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numDays = readInt();
        int[] swifts = new int[numDays+1];
        int[] semaphores = new int[numDays+1];
        int k = 0;
        for(int i = 1; i<=numDays; i++){
            swifts[i] = swifts[i-1] + readInt();
        }
        for(int i = 1; i<=numDays; i++){
            semaphores[i] = semaphores[i-1] + readInt();
            if(semaphores[i] == swifts[i]){
                k = i;
            }
        }
        System.out.println(k);
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