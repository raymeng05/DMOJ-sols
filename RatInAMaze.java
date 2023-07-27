import java.util.*;
import java.io.*;
public class RatInAMaze {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static class pair{
        int r;
        int c;

        public pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = readInt();
            }
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(0, 0));
        arr[0][0] = 1;
        int[][] moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while(!q.isEmpty()){
            pair cur = q.poll();
            int curR = cur.r;
            int curC = cur.c;
            for(int i = 0; i<4; i++){
                int newR = curR + moves[i][0];
                int newC = curC + moves[i][1];
                if(newR >= 0 && newR < n && newC >= 0 && newC < n && arr[newR][newC] == 0){
                    q.add(new pair(newR, newC));
                    arr[newR][newC] = 1;
                }
            }
        }
        if(arr[n-1][n-1] == 1){
            System.out.println("yes");
        } else {
            System.out.println("no");
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