import java.util.*;
import java.io.*;
public class DivideAndConnor {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = readInt();
        }
        int k = (int) (Math.log10(n)/Math.log10(3));
        for(int i = k; i>0; i--){
            int increment = (int) Math.pow(3, i);
            for(int j = 0; j<n; j+=increment){
                int temp = (int) Math.pow(3, i-1);
                int secondInd = j + temp;
                int thirdInd = j + 2*temp;
                for(int firstInd = j; firstInd<j+temp; firstInd++, secondInd++, thirdInd++){
                    //System.out.println(firstInd + " " + secondInd + " " + thirdInd + " ");
                    int temp2 = arr[secondInd];
                    arr[secondInd] = arr[firstInd];
                    arr[firstInd] = arr[thirdInd];
                    arr[thirdInd] = temp2;
                }
            }
            /*for(int l = 0; l<n; l++){
                System.out.print(" " + arr[l]);
            }
            System.out.println();*/
        }
        System.out.print(arr[0]);
        for(int i = 1; i<n; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();


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