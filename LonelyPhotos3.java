import java.util.*;
import java.io.*;
public class LonelyPhotos3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static String s;
    public static void main(String[] args) throws IOException{
        n = readInt();
        char[] arr = readLine().toCharArray();
        int[] consecutive = new int[n];
        long counter = 0;
        int k = 0;
        for(int i = 0; i<n; i++){
            consecutive[i] = 1;
        }
        for(int i = 1; i<n; i++){
            if(arr[i-1] == arr[i]){
                consecutive[k]++;
            } else {
                k++;
            }
        }
        for(int i = 0; i<n-2; i+=2){
            if(i+2 > k){
                break;
            }
            if(consecutive[i] != 1){
                if(i+2 <= k){
                    i++;
                }
            } else {
                i--;
            }
            if(consecutive[i+1] != 1){
                counter += (consecutive[i]-1 + consecutive[i+2]-1 + (consecutive[i+1]-1)*2);
            } else {
                counter += (consecutive[i]-1 + consecutive[i+2]-1 + consecutive[i]*consecutive[i+2]);
            }
        }
        System.out.println(counter);

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