import java.util.*;
import java.io.*;
public class AnotherSorting {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static class compareThings implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            if(a%10 == b%10){
                return Integer.compare(b, a);
            } else {
                return Integer.compare(a % 10, b % 10);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        Arrays.sort(arr, new compareThings());

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
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