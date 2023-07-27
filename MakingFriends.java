import java.util.*;
import java.io.*;
public class MakingFriends {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numCalls = readInt();
        int numMins = readInt();
        int[] participants = new int[numCalls];
        for(int i = 0; i<numCalls; i++){
            participants[i] = readInt();
        }
        Arrays.sort(participants);
        long sum = 0;
        for(int i = numCalls-1; i>=0; i--){
            int diff;
            if(i == 0){
                diff = numMins;
            } else {
                diff = participants[i] - participants[i - 1] + 1;
            }
            if(diff > numMins){
                diff = numMins;
            }
            numMins -= diff;
            for(int j = participants[i]; j>participants[i]-diff; j--){
                sum += j;
            }
            if(numMins == 0){
                break;
            }
        }
        System.out.println(sum);
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