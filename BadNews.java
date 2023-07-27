import java.util.*;
import java.io.*;
public class BadNews {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        String[][] crossword = new String[n][n];
        int numWords = readInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                String a = next().toLowerCase();
                crossword[i][j] = a;
            }
        }

        for(int i = 0; i<numWords; i++){
            String word = next().toLowerCase();
            int length = word.length();
            if(length <= n) {
                for (int k = 0; k < n; k++) {
                    for (int j = 0; j < n; j++) {
                        if(crossword[k][j].equals(word.indexOf(0))){
                            
                        }
                    }
                }


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
