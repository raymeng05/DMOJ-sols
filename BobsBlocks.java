import java.util.*;
import java.io.*;
public class BobsBlocks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numRows = readInt();
        int numColumns = readInt();
        int[][] arr = new int[numRows][numColumns];
        int max = -1;
        for(int r = 0; r<numRows; r++){
            for(int c = 0; c<numColumns; c++){
                int a = readInt();
                arr[r][c] = a;
                if(a > max){
                    max = a;
                }
            }
        }
        int counter = 0;
        for(int r = 0; r<numRows; r++) {
            for (int c = 0; c < numColumns; c++) {
                counter += (max-arr[r][c]);
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

