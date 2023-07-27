import java.util.*;
import java.io.*;
public class LiveStockLineup {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String[] arr = {"Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue"};
        Arrays.sort(arr);
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i<9; i++){
            map.put(arr[i], i);
        }
        int numEdges = readInt();
        for(int i = 0; i<numEdges; i++){
            String line = readLine();
            String a = line.substring(0, line.indexOf(" "));
            String b = line.substring(line.lastIndexOf(" "));
            
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