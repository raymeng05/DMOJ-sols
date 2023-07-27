import java.util.*;
import java.io.*;
public class MirroredPairs {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        System.out.println("Ready");
        boolean a = true;
        while(a){
            String s = readLine();
            if(s.isEmpty()){
                a = false;
                break;
            }
            char first = s.charAt(0);
            char second = s.charAt(1);
            if(first == 'p' && second == 'q' || first == 'q' && second == 'p' || first == 'b' && second == 'd' || first == 'd' && second == 'b'){
                System.out.println("Mirrored pair");
            } else {
                System.out.println("Ordinary Pair");
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
