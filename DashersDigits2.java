import java.util.*;
import java.io.*;
public class DashersDigits2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static int m;
    static String s;
    static int cheer[];
    static String output;
    static String compute(int maxIndex, int counter){
        int curIndex = maxIndex;
        while(counter <= m){
            int a = s.indexOf('0', curIndex+1);
            if(a != -1) {
                output += s.substring(curIndex+1, a);
                curIndex = a;
            } else {
                output += s.substring(curIndex+1);
                curIndex = -1;
            }
            counter++;
        }
        return output;
    }
    public static void main(String[] args) throws IOException {
         n = readInt();
         m = readInt();
         s = readLine();
         cheer = new int[m];
         output = "";
         int counter = 0;
         int maxIndexCheer = 0;
         cheer[0] = readInt();
         for(int i = 1; i<m; i++){
             cheer[i] = readInt();
             if(cheer[i]>=cheer[maxIndexCheer]){
                 maxIndexCheer = i;
             }
         }

        int k = 0;
         int maxIndex = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '0'){
                if(k == maxIndexCheer){
                    maxIndex = i;
                    break;
                }
                k++;
            }
        }
        String out = compute(maxIndex, 0);
        System.out.println(out);

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