import java.util.*;
import java.io.*;
public class CountTheTriplets {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            int num = readInt();
            set.add(num);
            arr[i] = num;
        }
        int counter = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int first = arr[i];
                int second = arr[j];
                
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