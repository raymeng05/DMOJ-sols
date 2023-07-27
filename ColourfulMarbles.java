import java.util.*;
import java.io.*;
public class ColourfulMarbles {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int k = readInt();
        int[] colours = new int[n];
        for(int i = 0; i<n; i++){
            int ind = readInt();
            colours[ind-1]++;
        }
        int thing = n;
        int output = 0;
        Arrays.sort(colours);
        for(int i = 0; i<n; i++){
            if(thing == k){
                break;
            }
            output += colours[i];
            thing--;
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