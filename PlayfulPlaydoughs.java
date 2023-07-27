import java.util.*;
import java.io.*;
public class PlayfulPlaydoughs {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int q = readInt();
        long[] numOfWeight = new long[(int)1e5+1];
        for(int i = 0; i<n; i++){
            int temp = readInt();
            numOfWeight[temp]++;
        }
        for(int i = 0; i<q; i++){
            int type = readInt();
            double weight = readInt();
            if(type == 1){
                long amount = numOfWeight[(int) weight];
                int lower = (int) Math.floor(weight/2);
                int higher = (int) Math.ceil(weight/2);
                //System.out.println(lower);
                //System.out.println(higher);
                numOfWeight[lower] += amount;
                numOfWeight[higher] += amount;
                numOfWeight[(int) weight] = 0;
            } else {
                System.out.println(numOfWeight[(int) weight]);
            }
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
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