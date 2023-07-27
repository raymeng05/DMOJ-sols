import java.util.*;
import java.io.*;
public class TooSpookyForMe {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int numDecorations = readInt();
        int numHouses = readInt();
        int maxSpooky = readInt();
        int[] arr = new int[numHouses+1];
        for(int i = 0; i<numDecorations; i++){
            int a = readInt();
            int b =  readInt();
            int s = readInt();
            arr[a]+=s;
            arr[b+1]-=s;
        }
        int counter = 0;
        for(int i = 1; i<numHouses+1; i++){
            arr[i] += arr[i-1];
            if(arr[i] < maxSpooky){
                counter++;
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





