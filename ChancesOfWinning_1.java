import java.util.*;
import java.io.*;
public class ChancesOfWinning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class scores {
        int s1;
        int s2;
        int s3;
        int s4;
        int numGames;

        public scores(int s1, int s2, int s3, int s4, int numGames){
            this.s1 = s1;
            this.s2= s2;
            this.s3 = s3;
            this.s4 = s4;
            this.numGames = numGames;
        }

    }

    public static void main(String args[]) throws IOException  {
        int team = readInt();
        int[] scores = new int[5];
        int[][] matches = {{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        int g = readInt();
        int[][] played = new int[g][2];
        for(int i = 0; i<g; i++){
            int a = readInt();
            int b = readInt();
            played[i][0] = Math.min(a, b);
            played[i][1] = Math.max(a, b);
            int scoreA = readInt();
            int scoreB = readInt();
            if(scoreA > scoreB){
                scores[a] += 3;
            } else if(scoreA < scoreB){
                scores[b]+=3;
            } else {
                scores[a]++;
                scores[b]++;
            }
        }
        int[][] remGames = new int[5-g][2];
        int count = 0;
        for(int i = 0; i<6; i++){
            boolean hasPlayed = false;
            for(int j = 0; j<g; j++){
                if(matches[i][0] == played[j][0] && matches[i][1] == played[j][1]){
                    hasPlayed = true;
                    break;
                }
            }
            if(!hasPlayed){
                remGames[count][0] = matches[i][0];
                remGames[count][1] = matches[i][1];
                count++;
            }
        }
        // make a graph
        // run a dfs or bfs
        int[][] remScores = new int[5-g][3];




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