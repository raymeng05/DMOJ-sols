import java.util.*;
import java.io.*;
public class Enraged {
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
        int[][] arr = new int[3][n+1];
        int[][] numS = new int[3][n+1];
        for(int i = 1; i<=2; i++){
            char[] temp = readLine().toCharArray();
            for(int j = 1; j<=n; j++){
                if(temp[j-1] == 'S'){
                    arr[i][j] = -1;
                }
            }
        }

        int[][] moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(1, 1));
        arr[1][1] = 1;
        boolean success = false;

        while(!q.isEmpty()){
            pair temp = q.poll();
            int r = temp.r;
            int c = temp.c;
            //System.out.println(r + " " + c);
            for(int i = 0; i<8; i++) {
                int newR = r + moves[i][0];
                int newC = c + moves[i][1];
                if (newR > 0 && newR <= 2 && newC > 0 && newC <= n && arr[newR][newC] == 0) {
                    arr[newR][newC] = 1;
                    numS[newR][newC] = numS[r][c];
                    q.add(new pair(newR, newC));
                } else if(newR > 0 && newR <= 2 && newC > 0 && newC <= n && arr[newR][newC] == -1){
                    if(numS[newR][newC] == 0 || numS[newR][newC] > numS[r][c]+1){
                        numS[newR][newC] = numS[r][c]+1;
                        q.add(new pair(newR, newC));
                    }
                } else if(newR > 0 && newR <= 2 && newC > 0 && newC <= n && arr[newR][newC] == 1){
                    if(numS[r][c] < numS[newR][newC]){
                        numS[newR][newC] = numS[r][c];
                        q.add(new pair(newR, newC));
                    }
                }
            }
            if(arr[2][n] == 1 && numS[2][n] <= 2){
                success = true;
            }
        }
        /*for(int i = 0; i<=2; i++){
            for(int j = 0; j<=n; j++){
                System.out.print(numS[i][j] + " ");
            }
            System.out.println();
        }*/
        if(success){
            System.out.println("YES");
        } else {
            System.out.println("NO");
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