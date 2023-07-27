import java.util.*;
import java.io.*;
public class ChancesOfWinning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int[] scores = new int[4];
        int favTeamNum = readInt();
        int gamesPlayed = readInt();
        for(int i = 0; i<gamesPlayed; i++){
            int a = readInt()-1;
            int b = readInt()-1;
            int scoreA = readInt();
            int scoreB = readInt();
            if(scoreA>scoreB){
                scores[a]+=3;
            } else if(scoreB>scoreA){
                scores[b] += 3;
            } else {
                scores[a]++;
                scores[b]++;
            }
        }
        int remainingGames = 6-gamesPlayed;
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



