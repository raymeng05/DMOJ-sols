import java.util.*;
import java.io.*;
public class AlexAndAnimalRights {
    static class Pair{
        int r;
        int c;
        public Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int numRows;
    static int numCols;
    static int[][] adj;
    static void bfs(int row, int col){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        adj[row][col] = -1;
        int[][] moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while(!q.isEmpty()){
            int r = q.peek().r;
            int c = q.peek().c;
            q.poll();
            for(int i = 0; i<4; i++){
                int newR = r + moves[i][0];
                int newC = c + moves[i][1];
                if(adj[newR][newC] != -1){
                    q.add(new Pair(newR, newC));
                    adj[newR][newC] = -1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        numRows = readInt();
        numCols = readInt();
        adj = new int[numRows][numCols];
        for(int i = 0; i<numRows; i++){
            String s = readLine();
            for(int j = 0; j<numCols; j++){
                if(s.charAt(j) == '#'){
                    adj[i][j] = -1;
                } else if(s.charAt(j) == 'M'){
                    adj[i][j] = 1;
                }
            }
        }
        int counter = 0;
        for(int i = 0; i<numRows; i++){
            for(int j = 0; j<numCols; j++){
                if(adj[i][j] == 1){
                    bfs(i, j);
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









