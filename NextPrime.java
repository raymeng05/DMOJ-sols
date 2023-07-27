import java.util.*;
import java.io.*;
public class NextPrime {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        boolean thing = true;
        while(thing){
            boolean continuer = true;
            if(n == 1 || n == 2){
                System.out.println(2);
                break;
            }
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    continuer = false;
                    break;
                }
            }
            if(continuer){
                System.out.println(n);
                break;
            }
            n++;
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