import java.util.*;
import java.io.*;
public class ChristmasList {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        char[][] matrix = new char[6][6];
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                matrix[i][j] = readCharacter();
            }
        }
        for(int i = 0; i<n; i++){
            char[] arr = readLine().toCharArray();
            int l = arr.length;

            for(int j = 0; j<l; j+=2){
                if(arr[j]<91 && arr[j+1]<91){
                    int row = arr[j]-64;
                    int col = arr[j+1]-48;
                    System.out.print(matrix[row][col]);
                } else if(arr[j]>91){
                    System.out.print(arr[j]);
                    j--;
                }
            }
            System.out.println();
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