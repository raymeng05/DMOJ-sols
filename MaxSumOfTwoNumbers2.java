import java.util.*;
import java.io.*;
public class MaxSumOfTwoNumbers2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        int[] arr = new int[n];
        int[] holder = new int[n];
        boolean a = true;
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i<n; i++){
            int key = m-arr[i];
            int index = Arrays.binarySearch(arr, key);
            if(index < 0){
                index = ((index+1)*-1)-1;
                if(index == n){
                    index--;
                } else if(index < 0){
                    continue;
                }
                holder[i] = arr[index] + arr[i];
            } else {
                System.out.println(m);
                a = false;
                break;
            }
        }
        if(a) {
            Arrays.sort(holder);
            System.out.println(holder[n - 1]);
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





