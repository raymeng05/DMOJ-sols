import java.util.*;
import java.io.*;
public class MultipleOfK {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int k = readInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        Map<Long, Integer> map = new HashMap<>();
        long maxLength = 0;
        long curSum = 0;

        for(int i = 0; i<n; i++){
            curSum += arr[i];

            long mod = curSum%k;

            if(mod == 0){
                maxLength = i+1;
            }
            if(!map.containsKey(mod)){
                map.put(mod, i);
            } else {
                int size = i-map.get(mod);
                maxLength = Math.max(maxLength, size);
            }
        }
        if(maxLength == 0){
            System.out.println(-1);
        } else {
            System.out.println(maxLength);
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