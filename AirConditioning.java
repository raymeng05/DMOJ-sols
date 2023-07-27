import java.util.*;
import java.io.*;
public class AirConditioning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt();
        int[] newArr = new int[n];
        int[] diffNew = new int[n];
        int[] ogArr = new int[n];
        int[] diffOG = new int[n];

        newArr[0] = readInt();
        diffNew[0] = newArr[0];
        for(int i = 1; i<n; i++){
            newArr[i] = readInt();
            diffNew[i] = newArr[i]-newArr[i-1];
        }

        ogArr[0] = readInt();
        diffOG[0] = ogArr[0];
        for(int i = 1; i<n; i++){
            ogArr[i] = readInt();
            diffOG[i] = ogArr[i]-ogArr[i-1];
        }
        int[] diffs = new int[n];
        for(int i = 0; i<n; i++){
            diffs[i] = diffNew[i]-diffOG[i];
        }
        boolean a = true;
        int counter = 0;
        for(int i = 0; i<n; i++){
            if(diffs[i] != 0){
                for(int j = i+1; j<n; j++){
                    if(Math.abs(diffs[j])>=Math.abs(diffs[j]+diffs[i]) && (diffs[i]<0 && diffs[j]>0) || diffs[j]<0 && diffs[i]>0){
                        diffs[i] += diffs[j];
                        counter += Math.abs(diffs[j]);
                        diffs[j] = 0;
                        if(diffs[i] == 0){
                            a = false;
                            break;
                        }
                    }
                }
                if(a){
                    counter += Math.abs(diffs[i]);
                    diffs[i] = 0;
                }
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