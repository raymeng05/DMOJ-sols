import java.util.*;
import java.io.*;
public class ArithmeticOrGemoteric {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int mod = (int)1e9+7;
    public static void main(String[] args) throws IOException {
       int numTests = readInt();
       for(int i = 0; i<numTests; i++){
           long first = readLong();
           long second = readLong();
           long third = readLong();
           long k = readLong();
           long num = 0;

           if((third/second) == (second/first)){
               long base = second/first;
               num = first * pow(base, k-1, mod)%mod;
           } else if(third-second == second-first){
               num = ((first+(second-first)*(k-1)%mod)%mod);
           }
           System.out.println(num);
       }
    }
    static long pow(long i, long pow, long mod){
        if(pow == 0) {
            return 1;
        }
        long t = pow(i, pow/2, mod);
        t = t*t % mod;
        if(pow % 2 == 0) {return t;}
        return t*i % mod;
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


