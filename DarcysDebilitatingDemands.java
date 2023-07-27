import java.util.*;
import java.io.*;
public class DarcysDebilitatingDemands {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int t = readInt();
        for(int i = 0; i<t; i++){
            int sum = readInt();
            int a = readInt();
            int b = readInt();
            int c = readInt();
            if(a + b + c < sum){
                System.out.println(-1);
                continue;
            }
            for(int j = 0; j<a; j++){
                if(sum-j < b + c){
                    System.out.print(j + " " + (sum-j-c) + " " + c);
                    break;
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