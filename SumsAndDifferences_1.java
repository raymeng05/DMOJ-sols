import java.util.*;
import java.io.*;

public class SumsAndDifferences {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] original = new int[n+1];
        int[] newArr = new int[n+1];
        int[] newIndexes = new int[n+1];
        if(n%3 == 0) {
            for (int i = 1; i <= n; i++) {
                int k = 0;
                int indexJ = 0;
                if (i % 3 == 1) {
                    k = i + 2;
                    System.out.println("? " + i + " " + k);
                    indexJ = k;
                } else if (i % 3 == 2) {
                    k = i-1;
                    System.out.println("? " + i + " " + k);
                    indexJ = k;
                } else {
                    k = i-1;
                    System.out.println("? " + k + " " + i);
                    indexJ = k;
                }
                int val = readInt();
                newArr[indexJ] = val;
            }
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
