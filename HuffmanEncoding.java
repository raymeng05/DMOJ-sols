import java.util.*;
import java.io.*;
public class HuffmanEncoding {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int k = readInt();
        Map<String, Character> map = new HashMap<>();
        for(int i = 0; i<k; i++){
            char c = readCharacter();
            String input = next();
            map.put(input, c);
        }
        String s = readLine();
        int length = s.length();
        int endInd = 1;
        for(int i = 0; i<length; i++){
            for(int j = i+1; j<=length; j++) {
                if (map.containsKey(s.substring(i, j))) {
                    System.out.print(map.get(s.substring(i, j)));
                    i = j-1;
                    break;
                }
            }
        }
        System.out.println();
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