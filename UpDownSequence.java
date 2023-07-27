import java.util.*;
import java.io.*;
public class UpDownSequence {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int t = readInt();
        for(int i = 0; i<t; i++){
            int n = readInt();
            int[] arr = new int[n];
            for(int j = 0; j<n; j++){
                arr[j] = readInt();
            }
            boolean possible = true;
            for(int j = 0; j<n-2; j++){
                if(arr[j] == 0 || arr[j+1] == 0 || arr[j+2] == 0){
                    if(arr[j] == arr[j+1] && arr[j] != 0 || arr[j+1] == arr[j+2] && arr[j+1] != 0){
                        possible = false;
                        break;
                    }
                    continue;
                }
                if(arr[j+1] > arr[j] && arr[j+1] > arr[j+2]|| arr[j+1] < arr[j] && arr[j+1]<arr[j+2]){
                    continue;
                }
                possible = false;
                break;
            }
            if(possible){
                System.out.println("YES");
            } else {
                System.out.println("NO");
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