import java.util.*;
import java.io.*;
public class DoYouKnowYourABCs {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        ArrayList<Long> arr = new ArrayList<>();
        for(int i = 0; i<7; i++){
            arr.add(readLong());
        }
        Collections.sort(arr);
        long a = arr.get(0);
        long b = arr.get(1);
        long c = arr.get(6) - a - b;
        System.out.print(a + " " + b + " " + c);

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