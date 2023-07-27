import java.util.*;
import java.io.*;
public class SleepCycle {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;


    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }

        int countCur = 1;
        int max = -1;
        boolean wasDecreasing = false;
        boolean decreasing = false;
        boolean wasSame = false;
        for(int i = 1; i<n; i++){
            if(arr[i] < arr[i-1]){
                if(!decreasing){
                    max = Math.max(max, countCur);
                    countCur = 1;
                }
                if(wasSame){
                    countCur = 1;
                    wasSame = false;
                }
                decreasing = true;
                wasDecreasing = true;
                countCur++;
            } else if(arr[i] > arr[i-1] && wasDecreasing){
                decreasing = false;
                countCur++;
                max = Math.max(countCur, max);
            } else {
                if(decreasing){
                    wasSame = true;
                    countCur++;
                } else {
                    countCur = 1;
                }
            }
        }
        if(max < 3){
            max = 0;
        }
        System.out.println(max);


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