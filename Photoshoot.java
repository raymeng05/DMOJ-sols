import java.util.*;
import java.io.*;
public class Photoshoot {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numCows = readInt();
        int[] arr = new int[numCows];
        for(int i = 0; i<numCows-1; i++){
            arr[i] = readInt();
        }
        for(int i = 1; i<=numCows; i++){
            int curr = i;
            ArrayList<Integer> cows = new ArrayList<>();
            boolean a = true;
            for(int j = 0; j<numCows-1; j++){
                if(!cows.contains(curr) && curr>0){
                    cows.add(curr);
                    curr = arr[j]-curr;
                    if(j == numCows-2 && !cows.contains(curr)){
                        cows.add(curr);
                    }
                } else {
                    a = false;
                    break;
                }
            }
            if(a){
                for(int k = 0; k<numCows; k++){
                    System.out.print(cows.get(k) + " ");
                }
                break;
            }
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
