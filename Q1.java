import java.util.*;
import java.io.*;
public class Q1 {
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
    public static void main(String[] args) throws IOException {
        int rows = readInt();
        int cols = readInt();
        int[][] grid = new int[rows][cols];
        int[][] dist = new int[rows][cols];
        List<pair>[] arr = new ArrayList[256];
        for(int i = 1; i<=255; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                grid[i][j] = readInt();
                if(grid[i][j] != 0) {
                    arr[grid[i][j]].add(new pair(i, j));
                }
            }
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(0, 0));
        if(grid[0][0] != 0){
            int ind = grid[0][0];
            for(pair tp: arr[ind]){
                int r1 = tp.r;
                int r2 = tp.c;
                if(grid[r1][r2] != -1){
                    q.add(new pair(r1, r2));
                    dist[r1][r2] = dist[0][0];
                    grid[r1][r2] = -1;
                }
            }
        }
        int[][] thing = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        grid[0][0] = -1;

        while(!q.isEmpty()){
            pair nxt = q.poll();
            int r = nxt.r;
            int c = nxt.c;
            for(int i = 0; i<4; i++){
                int newR = r + thing[i][0];
                int newC = c + thing[i][1];
                if(newR >= rows || newR < 0 || newC >= cols || newC < 0 || grid[newR][newC] == -1){
                    continue;
                }
                q.add(new pair(newR, newC));
                dist[newR][newC] = dist[r][c]+1;
                if(grid[newR][newC] != 0){
                    int ind = grid[newR][newC];
                    for(pair tp: arr[ind]){
                        int r1 = tp.r;
                        int r2 = tp.c;
                        if(grid[r1][r2] != -1){
                            q.add(new pair(r1, r2));
                            dist[r1][r2] = dist[newR][newC];
                            grid[r1][r2] = -1;
                            //System.out.println(r1 + " " + r2);
                            //System.out.println(dist[r1][r2]);
                        }
                    }
                }
                grid[newR][newC] = -1;
            }
            if(grid[rows-1][cols-1] == -1){
                break;
            }
        }
        System.out.println(dist[rows-1][cols-1]);

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