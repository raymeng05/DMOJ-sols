import java.util.*;
import java.io.*;
public class QueensCantAttackMe {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int numQueens = readInt();
        int counter = 0;
        int otherCounter = 0;
        boolean[][] chessBoard = new boolean[n][n];
        for (int i = 0; i < numQueens; i++) {
            int row = readInt() - 1;
            int col = readInt() - 1;
            for (int j = 0; j < n; j++) {
                if (chessBoard[j][col] == false) {
                    chessBoard[j][col] = true;
                }
            }
            for (int k = 0; k < n; k++) {
                if (chessBoard[row][k] == false) {
                    chessBoard[row][k] = true;
                }
            }
            int j = 1;
            while (row+j >= 0 && row+j < n && col-j >= 0 && col-j < n) {
                if (!chessBoard[row + j][col - j]) {
                    chessBoard[row + j][col - j] = true;
                }
                j++;
            }
            int k = 1;
            while (row-k >= 0 && row - k < n && col + k >= 0 && col + k < n) {
                if (!chessBoard[row - k][col + k]) {
                    chessBoard[row - k][col + k] = true;
                }
                k++;
            }
            int l = 1;
            while(row+l<n && col+l<n){
                if(!chessBoard[row+l][col+l]){
                    chessBoard[row+l][col+l] = true;
                }
                l++;
            }
            int p = 1;
            while(row-p>=0 && col-p >=0){
                if(!chessBoard[row-p][col-p]){
                    chessBoard[row-p][col-p] = true;
                }
                p++;
            }
        }
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    if (chessBoard[r][c] == false) {
                        counter++;
                    }
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





