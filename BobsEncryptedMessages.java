import java.util.*;
import java.io.*;
public class BobsEncryptedMessages {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        char[] a = readLine().toCharArray();
        char[] b = readLine().toCharArray();
        int length = a.length;
        if(b[0] < a[0]){
            b[0] += 26;
        }
        int diff = (b[0]-a[0]);

        boolean isEncryption = true;
        for(int i = 1; i<length; i++){
            if(b[i]<a[i]){
                b[i] += 26;
            }
            if(diff != (b[i]-a[i])){
                isEncryption = false;
                break;
            }
        }
        if(isEncryption){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
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