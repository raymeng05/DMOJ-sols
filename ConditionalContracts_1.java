import java.util.*;
import java.io.*;

public class ConditionalContracts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> holder = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int num = readInt();
            arr.add(num);
        }
        Collections.sort(arr);
        int temp = arr.get(0);
        int k = 0;
        while(k<n){
            int numEqual = arr.lastIndexOf(temp) - k+1;
            holder.add(numEqual);
            k = arr.lastIndexOf(temp) +1;
            int temp1 = arr.lastIndexOf(temp);
            if(temp1 + 1 < n) {
                temp = arr.get(temp1 + 1);
            }
        }

        Collections.sort(holder);
        if(holder.size()>1){
            System.out.println(holder.get(holder.size()-1) + holder.get(holder.size()-2));
        } else {
            System.out.println(holder.get(0));
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






