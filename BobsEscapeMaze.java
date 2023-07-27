import java.util.*;
import java.io.*;
class Pair{
    int x;
    int y;

    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BobsEscapeMaze {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int m = readInt();
        int n = readInt();
        boolean[][] vis = new boolean[m+1][n+1];
        int[][] moves = new int[m+1][n+1];
        int startRow = readInt();
        int startColumn = readInt();
        int exitRow = readInt();
        int exitColumn = readInt();
        for(int r = 1; r<m+1; r++){
            String s = readLine();
            for(int c = 1; c<n+1; c++){
                char a = s.charAt(c-1);
                if( a == '#'){
                    vis[r][c] = true;
                }
            }
        }

        Queue<Pair> q = new LinkedList<>();
        int[][] d = {{2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {-2, 1}, {-2, -1}};
        int[][] dist = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        q.add(new Pair(startRow, startColumn));
        int numMoves = 0;

        while(!q.isEmpty()){
            int x = q.peek().x;
            int y = q.peek().y;
            q.poll();

            for(int i = 0; i<8; i++){
                int newX = x + d[i][0];
                int newY = y + d[i][1];
                if(newX < 1 || newX > m || newY<1 || newY > n || vis[newX][newY]){
                    continue;
                }

                q.add(new Pair(newX, newY));
                vis[newX][newY] = true;
                moves[newX][newY] = moves[x][y] + 1;
            }

            for(int i = 0; i<4; i++){
                int newX = x + dist[i][0];
                int newY = y + dist[i][1];
                if(newX < 1 || newX > m || newY<1 || newY > n || vis[newX][newY]){
                    continue;
                }
                q.add(new Pair(newX, newY));
                vis[newX][newY] = true;
                moves[newX][newY] = moves[x][y] + 1;
            }
            if(vis[exitRow][exitColumn]){
                numMoves = moves[exitRow][exitColumn];
                System.out.println(numMoves);
                break;
            }
        }
        if(!vis[exitRow][exitColumn]){
            System.out.println(-1);
        }
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




