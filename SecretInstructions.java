import java.util.*;
import java.io.*;
public class SecretInstructions {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String a = next();
        String direction = "";
        while(!a.equals("99999")){
            int x = Integer.parseInt(a.substring(0, 1));
            int y = Integer.parseInt(a.substring(1, 2));
            String s = a.substring(2);
            int sum = x+y;
            if(sum%2 == 0 && sum != 0){
                direction = "right";
            } else if (sum%2 == 1){
                direction = "left";
            }

            System.out.println(direction + " " + s);

            a = next();
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