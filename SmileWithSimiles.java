import java.util.*;
import java.io.*;
public class SmileWithSimiles {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numAdjectives = readInt();
        int numNouns = readInt();
        String[] adj = new String[numAdjectives];
        for(int i = 0; i<numAdjectives; i++){
            adj[i] = next();
        }
        for(int i = 0; i<numNouns; i++){
            String noun = next();
            for(int j = 0; j<numAdjectives; j++){
                System.out.println(adj[j] + " as " + noun);
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










