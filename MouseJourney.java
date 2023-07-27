import java.util.*;
import java.io.*;
public class MouseJourney {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int r = readInt();
        int c = readInt();
        int[][] grid = new int[r+1][c+1];
        int k = readInt();
        for(int i = 0; i<k; i++){
            int row = readInt();
            int col = readInt();
            grid[row][col] = -1;
        }
        for(int i = 1; i<=r; i++){
            for(int j = 1; j<=c; j++){
                if(i == 1 && j == 1){
                    grid[i][j] = 1;
                    continue;
                }
                if(grid[i][j] == -1){
                    grid[i][j] = 0;
                } else {
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }
            }
        }
        System.out.println(grid[r][c]);

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