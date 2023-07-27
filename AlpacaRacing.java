import java.util.*;
import java.io.*;
public class AlpacaRacing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numAlpacas = readInt();
        long length = readInt();
        int numTimes = readInt();
        int x = readInt();
        long[] arr = new long[numAlpacas];
        long[] newSpeed = new long[numAlpacas];
        for(int i = 0; i<numAlpacas; i++){
            arr[i] = readInt();
            newSpeed[i] = arr[i] * (100-x)/100;
        }
        long mySpeed = readInt();
        Arrays.sort(arr);
        int counter = 0;
        for(int i = numAlpacas-1; i>=0; i--){
            if(arr[i] >= mySpeed && newSpeed[i] < mySpeed){
                counter++;
            } else {
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


