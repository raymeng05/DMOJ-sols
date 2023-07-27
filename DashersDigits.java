import java.util.*;
import java.io.*;
public class DashersDigits {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        String s = readLine();
        int[] cheer = new int[m];
        int max = -1;
        for(int i = 0; i<m; i++){
            cheer[i] = readInt();
        }
        String k = "";
        if(m == 1){
            int a = s.indexOf('0');
            k = s.substring(a+1) + s.substring(0, a);
        } else if(m == 2){
            int a = s.indexOf('0');
            int b = s.lastIndexOf('0');
            if(cheer[0] == cheer[1] || cheer[0]<cheer[1]){
                k = s.substring(b+1) + s.substring(0, a) + s.substring(a+1, b);
            } else {
                k = s.substring(a+1, b) + s.substring(b+1) + s.substring(0, a);
            }
        }
        System.out.println(k);
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