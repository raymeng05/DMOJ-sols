import java.util.*;
import java.io.*;
public class MonkeyPotato {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int k = readInt();
        int d = readInt();
        int[] arr = new int[d];
        int[] output = new int[k];
        boolean containsZero = false;
        int min = 10;
        for(int i = 0; i<d; i++){
            int num = readInt();
            if(num == 0){
                containsZero = true;
            }
            if(num < min && num != 0){
                min = num;
            }
            arr[i] = num;
        }

        if(containsZero && min != 10){
            output[0] = min;
            for(int i = 1; i<k-1; i++){
                output[i] = 0;
            }
            output[k-1] = min;
        } else if(!containsZero){
            for(int i = 0; i<k; i++){
                output[i] = min;
            }
        } else {
            System.out.println(-1);
            return;
        }
        for(int i = 0; i<k; i++){
            System.out.print(output[i]);
        }
        System.out.println();

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