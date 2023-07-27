import java.util.*;
import java.io.*;
public class SocialDistancingI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        char[] arr = readLine().toCharArray();
        ArrayList<Integer> zeroLengths = new ArrayList<>();
        int seq = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == '0'){
                seq++;
            } else if(arr[i] == '1' && seq != 0){
                zeroLengths.add(seq+1);
                seq = 0;
            }
        }


        for(int i = 0; i<2; i++){
            int size = zeroLengths.size();
            Collections.sort(zeroLengths);

            int max = zeroLengths.get(size-1);
            zeroLengths.remove(size-1);

            if(max%2 == 0){
                zeroLengths.add(max/2);
                zeroLengths.add(max/2);
            } else {
                zeroLengths.add(max/2);
                zeroLengths.add(max/2+1);
            }
        }
        Collections.sort(zeroLengths);

        System.out.println(zeroLengths.get(0));

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