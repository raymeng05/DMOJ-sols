import java.util.*;
import java.io.*;
public class SumsAndDifferences3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        long[] arr = new long[n+1];
        long[] newArr = new long[n+1];
        System.out.println("? 1 2");
        System.out.flush();
        int y = readInt();
        System.out.println("? 1 2");
        System.out.flush();
        long z = readLong();
        long b = z/2;
        long a = y + b;
        arr[1] = a;
        arr[2] = b;
        newArr[1] = 2*a;
        newArr[2] = 2*b;
        for(int i = 3; i<=n; i++){
            System.out.println("? 1 " + i);
            System.out.flush();
            long k = readLong();
            newArr[i] = k;
            arr[i] = newArr[1]-k;
            newArr[1] += arr[i];
        }
        System.out.print("! ");
        for(int i = 1; i<=n; i++){
            if(i == n){
                System.out.print(arr[i] + "\n");
            } else {
                System.out.print(arr[i] + " ");
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