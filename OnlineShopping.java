import java.util.*;
import java.io.*;
public class OnlineShopping {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
       int numCases = readInt();
       for(int i = 0; i<numCases; i++) {
           int numStores = readInt();
           ArrayList<String> arr = new ArrayList<>();
           for (int j = 0; j < numStores; j++){
               int numDiffItems = readInt();
               for(int k = 0; k<numDiffItems; k++){
                   String a = readLine();
                   arr.add(a);
               }
           }
           int k = readInt();
           for(int j = 0; j<k; j++){
               String name = next();
               int amount = readInt();

               for(int l = 0; l<arr.size(); l++){
                   
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




