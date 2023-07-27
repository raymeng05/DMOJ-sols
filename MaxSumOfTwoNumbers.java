import java.util.*;
import java.io.*;
public class MaxSumOfTwoNumbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        long n = readLong();
        long max = readLong();
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long temp = readLong();
            if(temp < max){
                arr.add(temp);
            }
        }
        long maxS = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            long leftS = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                long rightS = arr.get(j);
                if (leftS != rightS && (leftS + rightS) <= maxS && (leftS + rightS) > maxS) {
                    maxS = leftS + rightS;
                    break;
                }
            }
            if(maxS == max){
                break;
            }
            }

        System.out.println(maxS);
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





