import java.util.*;
import java.io.*;
public class TripleFatLadies {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        ArrayList<Long> cubes = new ArrayList<>();
        long first = 192;
        cubes.add(first);
        for(long i = first; i<20000; i+=500){
            cubes.add(i);
        }
        for(int i = 0; i<n; i++){
            long num = readLong();
            for(int j = 0; j<cubes.size(); j++){
                if(cubes.get(j) > num){
                    System.out.println(cubes.get(j));
                    break;
                }
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