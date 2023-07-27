import java.util.*;
import java.io.*;
public class BucketBrigade {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[10][10];
        int row1 = 0;
        int col1 = 0;
        int row2 = 0;
        int col2 = 0;
        int rowRock = 0;
        int colRock = 0;
        for(int r = 0; r<10; r++){
            String s = readLine();
            for(int c = 0; c<10; c++){
                if(s.charAt(c) == 'B'){
                    arr[r][c] = 1;
                    row1 = r;
                    col1 = c;
                } else if(s.charAt(c) == 'L'){
                    arr[r][c] = 1;
                    row2 = r;
                    col2 = c;
                } else if(s.charAt(c) == 'R'){
                    arr[r][c] = -1;
                    rowRock = r;
                    colRock = c;
                }
            }
        }
        int distR = Math.abs(row1-row2);
        int distC = Math.abs(col1-col2);
        int distance = distR + distC;
        if((rowRock == row1 && row1 == row2 && (colRock < col2 && colRock > col1 || colRock < col1 && colRock > col2)) || (colRock == col1 && col1 == col2 && (rowRock > row1 && rowRock < row2 || rowRock >row2 && rowRock < row1 ))){
            distance += 1;
        } else {
            distance -= 1;
        }

        System.out.println(distance);

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