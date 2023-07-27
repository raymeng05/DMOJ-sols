import java.util.*;
import java.io.*;

public class ConditionalContracts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] arr = new int[1000000001];
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<n; i++){
            int num = readInt();
            arr[num]++;
            s.add(num);
        }
        Object[] holder;
        holder = s.toArray();

        int maxIndex = (int) holder[0];
        for(int i = 1; i<holder.length; i++){
            int ind = (int) holder[i];
            if(arr[ind] > arr[maxIndex]){
                maxIndex = ind;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = 0;

        maxIndex = (int) holder[0];
        for(int i = 1; i<holder.length; i++){
            int ind = (int) holder[i];
            if(arr[ind]>arr[maxIndex]){
                maxIndex = ind;
            }
        }
        System.out.println(temp + arr[maxIndex]);

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





