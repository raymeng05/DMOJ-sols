import java.util.*;
import java.io.*;
public class AirCowditioning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] preferStalls = new int[n];
        int[] intialStalls = new int[n];
        int[] deltaArray = new int[n+1];
        int[] diffArr = new int[n+1];
        for(int i = 0; i<n; i++){
            preferStalls[i] = readInt();
        }
        for(int i = 0; i<n; i++){
            intialStalls[i] = readInt();
            deltaArray[i] = preferStalls[i]-intialStalls[i];
        }
        deltaArray[n] = 0;
        diffArr[0] = deltaArray[0];
        for(int i = 1; i<=n; i++){
            diffArr[i] = deltaArray[i]-deltaArray[i-1];
        }
        int counter = 0;
        for(int i = 0; i<=n; i++){
            if(diffArr[i]>0){
                counter += diffArr[i];
            }
        }
        System.out.println(counter);
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