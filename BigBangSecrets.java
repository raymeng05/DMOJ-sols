import java.util.*;
import java.io.*;
public class BigBangSecrets {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int k;
    static char getNewChar(int value, int pos){
        int temp = 3*pos + k;
        int a = (value - temp);
        if(a < 65){
            a += 26;
        } else if (a>90){
            a -= 26;
        }
        return (char) a;
    }
    public static void main(String[] args) throws IOException {
        k = readInt();
        String s = next();
        for(int i = 0; i<s.length(); i++){
            System.out.print(getNewChar(s.charAt(i), i+1));
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











