import java.util.*;
import java.io.*;
public class LiveStockLineup {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<String> restrictionsA;
    static ArrayList<String> restrictionsB;
    public static void main(String[] args) throws IOException {
        int a[] = {1, 2, 3};
         do {
             for (int x : a) System.out.print(x + " ");
             System.out.println();
         }
        while(next_permutation(a));
    }
    static boolean next_permutation(int a[]) {
        if(a.length <= 1) return false;
        int p = a.length - 2, q = a.length - 1;
        while(p>=0 && a[p]>= a[p+1]) p--;
        if(p < 0) return false;
        while(a[q] <= a[p]) q--;
        int tmp = a[p]; a[p] = a[q]; a[q] = tmp;
        for(int l=p+1, r=a.length-1; l<r; l++, r--) {
            tmp = a[l]; a[l] = a[r]; a[r] = tmp;
        }
        return true;
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



