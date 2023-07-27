import java.util.*;
import java.io.*;
public class BobsHistogram {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int[] arr;
    static int n;
    static int calcCost(int keyCost){
        int counter = 0;
        for(int i = 0; i<n; i++){
            int temp = arr[i]-keyCost;
            counter += temp*temp;
        }
        return counter;
    }
    public static void main(String[] args) throws IOException {
        n = readInt();
        arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = arr[0]; i<=arr[n-1]; i++){
            int val = calcCost(i);
            if(val < min){
                min = val;
            }
        }
         System.out.println(min);



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





