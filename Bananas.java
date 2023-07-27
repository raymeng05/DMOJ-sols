import java.util.*;
import java.io.*;
public class Bananas {
    public boolean isMonkey(String a){
        boolean k = true;
        for(int i = 1; i<a.length(); i+=2){
            if(a.charAt(i) != 'N'){
                k = false;
                break;
            }
        }
        for(int i = 0; i<a.length(); i+=2){
            if(a.charAt(i) != 'A'){
                k = false;
                break;
            }
        }
        if(k){
            return true;
        } else {
            return false;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
       boolean a = true;
       while(a){
           String s = readLine();
           if(s.equals("X")){
               break;
           }
           if(s.equals("A")){
               System.out.println("YES");
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



