import java.util.*;
import java.io.*;
public class CyclicShifts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String text = readLine();
        String s = next();
        String a = s;
        boolean containsCyclic = false;
        for(int i = 0; i<s.length(); i++){
            a = a.substring(1, a.length()) + a.substring(0, 1);
            if(text.contains(a)){
                containsCyclic = true;
                break;
            }
        }
        if(containsCyclic){
            System.out.println("yes");
        } else {
            System.out.println("no");
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











