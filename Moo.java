import java.util.*;
import java.io.*;
public class Moo {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        String t = readLine();
        int length = t.length();

        int numMoo = 0;
        boolean isSubstring = true;
        if(length < 5){

        }
        int start = t.indexOf("moo");
        if(start == 1 && t.charAt(0) != 'o'){
            isSubstring = false;
        } else if(start == 2 && !t.startsWith("oo")){
            isSubstring = false;
        }
        for(int i = start; i<length-2; i++){

            if(t.startsWith("moo", i)){
                numMoo++;
                i += 2;
            } else {
                isSubstring = false;
                break;
            }
        }
        int last = t.lastIndexOf("moo")+3;
        if(last == length-3){

        } else if(last == length-4 && t.charAt(length - 1) != 'm'){
            isSubstring = false;
        } else if(last == length-5 && !t.substring(length-2).equals("mo")){
            isSubstring = false;
        }
        if(start != 0){
            numMoo++;
        }
        if(last != length-3){
            numMoo++;
        }
        if(numMoo > n || !isSubstring){
            System.out.println("no");
        } else {
            System.out.println("yes");
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