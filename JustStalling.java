import java.util.*;
import java.io.*;
public class JustStalling {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numCows = readInt();
        ArrayList<Integer> heights = new ArrayList<>();
        ArrayList<Integer> stalls = new ArrayList<>();
        int[] arr = new int[numCows];
        for(int i = 0; i<numCows; i++){
            heights.add(readInt());
        }
        for(int i = 0; i<numCows; i++){
            stalls.add(readInt());
        }
        Collections.sort(heights, Collections.reverseOrder());
        Collections.sort(stalls, Collections.reverseOrder());

        for(int i = 0; i<numCows; i++){
            for(int j = 0; j<numCows; j++) {
                if (heights.get(i) <= stalls.get(j)) {
                    arr[i]++;
                }
            }
        }
        int k = 0;
        long output = 1;
        for(int i = 0; i<numCows; i++){
            output *= arr[i]-k;
            k++;
        }
        System.out.println(output);

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







