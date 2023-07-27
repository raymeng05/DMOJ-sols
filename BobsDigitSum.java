import java.util.*;
import java.io.*;
public class BobsDigitSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
      int numIntegers = readInt();
      int max = -1;
      for(int i = 0; i<numIntegers; i++){
          int counter = 0;
          String s = readLine();
          for(int j = 0; j<s.length(); j++){
              int a = Integer.parseInt(s.substring(j, j+1));
              counter += a;
          }
          if(counter > max){
              max = counter;
          }
      }
      System.out.println(max);
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


