import java.util.*;
import java.io.*;
public class MonkeyShopping {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int b = readInt();
        int c = readInt();
        int d = readInt();
        if(a < b && c < d){
            System.out.println("Go to the department store");
        } else if(a < b){
            System.out.println("Go to the grocery store");
        } else if(c < d){
            System.out.println("Go to the pharmacy");
        } else {
            System.out.println("Stay home");
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