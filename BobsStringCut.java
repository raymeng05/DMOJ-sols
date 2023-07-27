import java.util.*;
import java.io.*;
public class BobsStringCut {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        char[] arr = readLine().toCharArray();
        int length = arr.length;

        Set<Character> left = new HashSet<>();
        Set<Character> right = new HashSet<>();
        for(int i = 0; i<n; i++){
            right.add(arr[i]);
        }
        System.out.println(right);
        int max = 0;
        for(int i = 0; i<n-1; i++){
            left.add(arr[i]);
            right.remove(arr[i]);

            int count = 0;
            for(Character temp : left){
                //System.out.println(temp);
                if(right.contains(temp)){
                    count++;
                }
            }
            max = Math.max(count, max);
        }
        System.out.println(max);

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