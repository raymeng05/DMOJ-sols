import java.util.*;
import java.io.*;
public class CowGymnastics {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numSessions = readInt();
        int numCows = readInt();
        int[][] rankings = new int[numSessions][numCows];
        int count = 0;
        for(int i = 0; i<numSessions; i++){
            for(int j = 0; j<numCows; j++){
                rankings[i][j] = readInt();
            }
        }
        for(int i = 0; i<numCows; i++){
            for(int j = 0; j<numCows; j++){
                int cow1 = rankings[0][i];
                int cow2 = rankings[0][j];
                int numPairs = 0;
                if(cow1 != cow2){
                    for(int a = 0; a<numSessions; a++){
                        int indexOfCow1 = 0;
                        int indexOfCow2 = 0;
                        for(int b = 0; b<numCows; b++){
                            if(rankings[a][b] == cow1){
                                indexOfCow1 = b;
                            }
                            if(rankings[a][b] == cow2){
                                indexOfCow2 = b;
                            }
                        }
                        if(indexOfCow1 < indexOfCow2){
                            numPairs++;
                        }
                    }
                }
                if(numPairs == numSessions){
                    count++;
                }
            }
        }
        System.out.println(count);
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




