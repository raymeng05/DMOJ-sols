import java.util.*;
import java.io.*;
class pairr{
    int r;
    int c;
    public pairr(int r, int c){
        this.r = r;
        this.c = c;
    }
}
public class SurpriseTeleport {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numRows = readInt();
        int numCols = readInt();
        int startRow = readInt();
        int startCol = readInt();
        int endRow = readInt();
        int endCol = readInt();
        int[][] arr= new int[numRows][numCols];
        for(int i = 0; i<numRows; i++){
            String s = readLine();
            for(int j = 0; j<numCols; j++){
                if(s.charAt(j) == 'X'){
                    arr[i][j] = -1;
                }
            }
        }

        int numDevices = readInt();
        for(int i = 0; i<numDevices; i++){
            int r = readInt();
            int c = readInt();
            arr[r][c] = 1;
        }
        int[][] dist = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int[][] moves = new int[numRows][numCols];
        int distDevice = 0;
        int distOffice = 0;
        int k = 0;
        Queue<pairr> q = new LinkedList<>();
        q.add(new pairr(startRow, startCol));
        boolean foundTp = false;
        boolean foundOffice = false;
        if(arr[startRow][startCol] == 1){
            foundTp = true;
        }
        while(!q.isEmpty()){
            int r = q.peek().r;
            int c = q.peek().c;
            q.poll();

            for(int i = 0; i<4; i++){
                int newR = r + dist[i][0];
                int newC = c + dist[i][1];
                if(newR < 0 || newR >= numRows|| newC<0 || newC >= numCols || arr[newR][newC] == -1){
                    continue;
                } else if(arr[newR][newC] == 1 && !foundTp){
                    distDevice = moves[r][c]+1;
                    moves[newR][newC] = distDevice;
                    foundTp = true;
                    arr[newR][newC] = -1;
                }
                q.add(new pairr(newR, newC));
                arr[newR][newC] = -1;
                moves[newR][newC] = moves[r][c] + 1;
            }
            if(!foundOffice && arr[endRow][endCol] == -1){
                distOffice = moves[r][c]+1;
                foundOffice = true;
            }
            if(foundOffice && foundTp){
                break;
            }
        }
        //System.out.println(distOffice);
        //System.out.println(distDevice);
        if(distOffice <= distDevice) {
            System.out.println(0);
        } else {
            System.out.println(distOffice - distDevice);
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





