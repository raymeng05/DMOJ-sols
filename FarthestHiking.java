import java.util.*;
import java.io.*;
public class FarthestHiking {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int numMins = readInt();
        int dist = readInt();
        int upHillMins = readInt();
        int flatMins = readInt();
        int downHillMins = readInt();
        char[] arr = readLine().toCharArray();

        int curDist = 0;
        int meters = dist;
        for(int i = 0; i<dist; i++){
            if(arr[i] == 'u' || arr[i] == 'd'){
                curDist += upHillMins + downHillMins;
            } else {
                curDist += flatMins*2;
            }
            if(curDist > numMins){
                meters = i;
                break;
            }
        }
        System.out.println(meters);
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





