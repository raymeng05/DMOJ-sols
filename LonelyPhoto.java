import java.util.*;
import java.io.*;
public class LonelyPhoto {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static String s;
    static long numLonely(long size){
        int counter = 0;
        for(int i = 0; i<=n-size; i++){
            String a = s.substring(i, (int)(i+size));
            if(a.indexOf('H') == a.lastIndexOf('H') && a.indexOf('H') != -1 || a.indexOf('G') == a.lastIndexOf('G') && a.indexOf('G') != -1){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) throws IOException{
        n = readInt();
        s = readLine();
        int counter = 0;
        for(long i = 3; i<=n; i++){
            counter += numLonely(i);
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