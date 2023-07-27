import java.util.*;
import java.io.*;
public class PrettyString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        char[] arr = readLine().toCharArray();
        int length = arr.length;
        ArrayList<Integer> upperCase = new ArrayList<>();
        for(int i = 0; i<length; i++){
            if(arr[i]<91){
                upperCase.add(i);
            }
        }
        int numAdded = 0;
        for(int i = 0; i<upperCase.size(); i++){
            if((upperCase.get(i)+numAdded)%5 == 0){
                continue;
            }
            numAdded += 5-((numAdded+upperCase.get(i))%5);
            //System.out.println(upperCase.get(i));
            //System.out.println(numAdded);
        }
        System.out.println(numAdded);
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