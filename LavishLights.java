import java.util.*;
import java.io.*;
public class LavishLights {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static int[] lcm;
    static int binary(int second, int left, int right){
        while(right >= left){
            int mid = (left+right)/2;
            if(second%lcm[mid] != 0 && second%lcm[mid-1] == 0){
                return mid+1;
            }
            if(second%lcm[mid] == 0){
                left = mid+1;
            } else if(second%lcm[mid] != 0) {
                right = mid;
            }
        }
        if(left >= n){
            return -1;
        }
        return left+1;

    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    public static void main(String[] args) throws IOException {
        n = readInt();
        int q = readInt();
        int[] arr = new int[n];
        lcm = new int[n];
        int lastIndex = n-1;
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        for(int i = 0; i<n; i++){
            if(i == 0){
                lcm[i] = arr[i];
            } else {
                lcm[i] = arr[i]*lcm[i-1]/gcd(arr[i], lcm[i-1]);
            }
            if(lcm[i] > 10e9){
                lastIndex = i-1;
                break;
            }
        }
        //System.out.println(lastIndex);
        for(int i = 0; i<q; i++){
            int second = readInt();
            int index = binary(second, 0, lastIndex);
            System.out.println(index);
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