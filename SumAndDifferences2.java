import java.util.*;
import java.io.*;

public class SumAndDifferences2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        long[] original = new long[n+1];
        long[] newArr = new long[n+1];
        int[] newIndexes = new int[n+1];
        if(n == 2){
            for (int k = 1; k <= 2; k++) {

                if(k == 1){
                    System.out.println("? " + k + " " + (k+1));
                    System.out.flush();
                } else {
                    System.out.println("? " + k + " " + (k-1));
                    System.out.flush();
                }
                long val = readLong();
                if(val == 10e18 + 1){
                    break;
                }
                newArr[k] = val;
                if(k == 2){
                    original[2] = val/-2;
                    original[1] =  original[2] + newArr[1];
                    System.out.println("! " + original[1] + " " + original[2]);
                }
            }
        } else if(n == 3){
            for(int k = 1; k<=3; k++){
                int j = 0;
                if(k == 1){
                    System.out.println("? " + 2 + " " + 1);
                    System.out.flush();
                     j = 1;
                } else if(k == 2){
                    System.out.println("? " + 1 + " " + 3);
                    System.out.flush();
                    j = 3;
                } else {
                    System.out.println("? " + 2 + " " + 3);
                    System.out.flush();
                    j = 3;
                }
                long val = readLong();
                if(val == 10e18 + 1){
                    break;
                }
                newArr[k] = val;
                if(k == 3){
                    original[3] = (newArr[3]-original[1]);
                    original[1] = (newArr[3]-original[3])/2;
                    original[2] = original[1] + newArr[2];
                    System.out.println("! " + original[1] + " " + original[2] + " " + original[3]);
                }
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
