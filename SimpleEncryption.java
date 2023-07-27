import java.util.*;
import java.io.*;
public class SimpleEncryption {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String keyword = next();
        int length = keyword.length();
        int[] arr = new int[length];
        for(int i = 0; i<length; i++){
            arr[i] = keyword.charAt(i)-65;
        }

        String s = readLine();
        int index = 0;
        for(int i = 0; i<s.length(); i++){
            if(!Character.isLetter(s.charAt(i))){
                continue;
            }
            int num = index%length;
            //System.out.println(num);
            int output = arr[num] + s.charAt(i);
            if(output > 90){
                output -= 26;
            }
            System.out.print((char)output);
            index++;
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











