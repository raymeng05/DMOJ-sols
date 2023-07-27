import java.util.*;
import java.io.*;
public class TandemBicycle {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int q = readInt();
        int n = readInt();
        int[] Dmoj = new int[n];
        int[] peg = new int[n];
        for(int i = 0; i<n; i++){
            Dmoj[i] = readInt();
        }
        for(int i = 0; i<n; i++){
            peg[i] = readInt();
        }
        Arrays.sort(Dmoj);
        Arrays.sort(peg);
        int sum = 0;
        if(q == 1){
            for(int i = 0; i<n; i++){
                sum += Math.max(Dmoj[i], peg[i]);
            }
        } else {
            for(int i = 0, j = n-1; i<n; i++, j--){
                sum += Math.max(Dmoj[i], peg[j]);
            }
        }
        System.out.println(sum);

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