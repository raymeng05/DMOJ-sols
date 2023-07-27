import java.util.*;
import java.io.*;
public class BobsString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        char[] arr = new char[n];
        for(int i = 0; i<n; i++){
            arr[i] = readCharacter();
        }
        for(int l = 0, r = n-1; l<=r;){
            if(r == l){
                System.out.print(arr[r]);
                System.out.println();
                break;
            }
            if(arr[r] < arr[l]){
                System.out.print(arr[r]);
                r--;
            } else if(arr[r]>arr[l]){
                System.out.print(arr[l]);
                l++;
            } else {
                int l1 = l;
                int r1 = r;
                //System.out.println(l1 + " " + r1);
                while(arr[l1] == arr[r1] && l1 <= r1){
                    l1++;
                    r1--;
                }
                if(arr[l1]>arr[r1]){
                    System.out.print(arr[r]);
                    r--;
                } else {
                    System.out.print(arr[l]);
                    l++;
                }
            }

        }

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