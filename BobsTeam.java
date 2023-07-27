import java.util.*;
import java.io.*;
public class BobsTeam {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        long[] lvl1 = new long[n];
        long[] lvl2 = new long[n];
        long[] lvl3 = new long[n];
        for(int j = 0; j<n; j++){
            lvl1[j] = readLong();
        }
        for(int j = 0; j<n; j++){
            lvl2[j] = readLong();
        }
        for(int j = 0; j<n; j++){
            lvl3[j] = readLong();
        }
        Arrays.sort(lvl1);
        Arrays.sort(lvl2);
        Arrays.sort(lvl3);
        long counter = 0;
        for(int i = 0; i<n; i++){
            long num = lvl2[i];
            long numLess = n;
            long numLarger = n;
            for(int j = 0; j<n; j++){
                if(lvl1[j]>=num){
                    numLess = j;
                    break;
                }
            }
            for(int j = n-1; j>=0; j--){
                if(lvl3[j]<=num){
                    numLarger = n-(j+1);
                    break;
                }
            }
            counter += numLess*numLarger;
            //System.out.println(counter);
        }
        System.out.println(counter);

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





