import java.util.*;
import java.io.*;
public class PartialGame {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numPiles = readInt();
        long duke = 0;
        long maid = 0;
        for(int i = 0; i<numPiles; i++){
            int num = readInt();
            if(num%2 == 0){
                duke += num/2;
            } else {
                maid += (num+1)/2;
            }
        }
        if(duke > maid){
            System.out.println("Duke");
        } else {
            System.out.println("Alice");
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


