import java.util.*;
import java.io.*;
public class BigMatressTournament {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int t = readInt();
        for(int i = 0; i<t; i++){
            int a = readInt();
            int b = readInt();
            int c = readInt();
            int total = a+b*2+c*3;
            if(total%2 == 0){
                if(a > 0 && b > 0 && c > 0 && a>=c && a%2 == c%2){
                        System.out.println("YES");
                        continue;
                } else if (c == 0 && a%2 == 0 && b%2 == 0){
                    System.out.println("YES");
                    continue;
                } else if(b == 0 && a != 0 && c != 0 && a%2 == c%2){
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
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