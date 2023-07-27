import java.util.*;
import java.io.*;
public class WhereAmI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
       int numMailBoxes = readInt();
       String s = readLine();
       for(int j = 1; j<numMailBoxes; j++) {
           boolean ifAllUnique = true;
           for (int i = 0; i < numMailBoxes-j+1; i++) {
               String a = s.substring(i, i+j);
               if (s.indexOf(a) != s.lastIndexOf(a)){
                    ifAllUnique = false;
                    break;
               }
           }
           if(ifAllUnique){
               System.out.println(j);
               break;
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




