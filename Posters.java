import java.util.*;
import java.io.*;
public class Posters {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int cols = readInt();
        int rows = readInt();
        //columns are x, rows are y
        int n = readInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i<n; i++){
            int x1 = readInt()-1;
            int y1 = readInt()-1;
            int x2 = readInt()-1;
            int y2 = readInt()-1;
            for(int r = y1; r <= y2; r++){
                for(int c = x1; c <= x2; c++){
                    arr[r][c] = 1;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(arr[i][j] == 1){
                    ans++;
                }
            }
        }
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