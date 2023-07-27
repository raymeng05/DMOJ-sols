import java.util.*;
import java.io.*;
public class EnglishOrFrench {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int countT = 0;
        int countS = 0;
        for(int i = 0; i<n; i++){
            String s = readLine();
            int length = s.length();
            for(int j = 0; j<length; j++){
                if(s.charAt(j) == 't' || s.charAt(j) == 'T'){
                    countT++;
                } else if(s.charAt(j) == 's' || s.charAt(j) == 'S'){
                    countS++;
                }
            }
        }
        if(countS >= countT){
            System.out.println("French");
        } else {
            System.out.println("English");
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