import java.util.*;
import java.io.*;
public class MinAbsoluteDifference {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int m = readInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i = 0; i<n; i++){
            arr1[i] = readInt();
        }
        for(int i = 0; i<m; i++){
            arr2[i] = readInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int key = arr1[i];
            int temp = Arrays.binarySearch(arr2, key);
            //System.out.println(key + " " + temp);
            if(temp>=0){
                minDiff = 0;
                break;
            }
            temp = (temp+1)*-1;
            if(temp == 0){
                minDiff = Math.min(minDiff, Math.abs(arr1[i]-arr2[temp]));
            } else if(temp == m){
                minDiff = Math.min(minDiff, Math.abs(arr1[i]-arr2[temp-1]));
            } else {
                minDiff = Math.min(minDiff, Math.abs(arr1[i]-arr2[temp]));
                minDiff = Math.min(minDiff, Math.abs(arr1[i]-arr2[temp-1]));
            }
        }
        System.out.println(minDiff);
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