import java.util.*;
import java.io.*;
public class KoalaKonundrum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numLetters = readInt();
        int[] arr = new int[26];
        int numSingles = 0;
        String s = readLine();
        for(int i = 0; i<numLetters; i++){
            int a = s.charAt(i)-97;
            arr[a]++;
        }

        for(int i = 0; i<26; i++){
            if(arr[i] % 2 == 1){
                numSingles++;
            }
        }
        if(numSingles == 0){
            System.out.println(1);
        } else {
            System.out.println(numSingles);
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
