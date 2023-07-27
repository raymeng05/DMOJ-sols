import java.util.*;
import java.io.*;
public class SearchingForSeats {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int m = readInt();
        int k = readInt();
        boolean[][] adj = new boolean[n+1][m+1];
        for(int i = 0; i<k; i++){
            int r = readInt();
            int c = readInt();
            adj[r][c] = true;
        }
        int ans = 0;
        int[][] moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(!adj[i][j]){
                    int count = 0;
                    for(int p = 0; p<8; p++){
                        int newR = i+moves[p][0];
                        int newC = j+moves[p][1];
                        if(newR > 0 && newR <= n && newC > 0 && newC <=m && adj[newR][newC]){
                            count++;
                        }
                    }
                    if(count >= 3){
                        ans++;
                    }
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