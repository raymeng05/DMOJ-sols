import java.util.*;
import java.io.*;
public class KaguyaWantstoLetIshigamiPass {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static String[] holder;
    static int ans;
    static void check(int[] arr, int k){
        int lowest = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int curScore = 0;
            for(int j = 0; j<k; j++){
                if(holder[i].charAt(j) == 'F' && arr[j] == 0 || holder[i].charAt(j) == 'T' && arr[j] == 1){
                    curScore++;
                }
            }
            lowest = Math.min(lowest, curScore);
        }
        ans = Math.max(ans, lowest);


    }
    static void allBinaryStrings(int k, int arr[], int i){
        if(i == k){
            check(arr, k);
            return;
        }

        arr[i] = 0;
        allBinaryStrings(k, arr, i+1);

        arr[i] = 1;
        allBinaryStrings(k, arr, i+1);
    }

    public static void main(String args[]) throws IOException  {
        n = readInt();
        int k = readInt();
        holder = new String[n];
        for(int i = 0; i<n; i++){
            holder[i] = readLine();
        }
        ans = -1;
        int[] empty = new int[k];
        allBinaryStrings(k, empty, 0);

        System.out.println(ans);
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