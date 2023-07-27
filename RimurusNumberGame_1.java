import java.util.*;
import java.io.*;

public class RimurusNumberGame {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static long n;
    static long ans;
    static void func(String s){
        if(Long.parseLong(s)>n){
            return;
        }
        if(!s.equals("0")){
            ans += 1;
        }
        func(s+"2");
        func(s+"3");
    }
    public static void main(String[] args) throws IOException {
        n = readLong();
        ans = 0;
        func("0");
        System.out.println(ans);
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
