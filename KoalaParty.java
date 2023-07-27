import java.util.*;
import java.io.*;
public class KoalaParty {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numBowls = readInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<numBowls; i++){
            arr.add(readInt());
        }
        if(numBowls == 2){
            if(Math.abs(arr.get(0)-arr.get(1)) % 2 == 0){
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
        Collections.sort(arr);
        for(int i = 1; i<numBowls; i++){
            
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

