import java.util.*;
import java.io.*;
public class ComputerPurchase {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class pair implements Comparable <pair>{
        int val;
        String name;

        public pair(int val, String a) {
            this.val = val;
            name = a;
        }

        public int compareTo(pair p){
            if(p.val != val){
                return Integer.compare(val, p.val);
            } else {
                return p.name.compareTo(name);
            }
        }
    }
    public static void main(String args[]) throws IOException  {
        int n = readInt();
        pair[] arr = new pair[n];
        for(int i = 0; i<n; i++){
            String a = next();
            int r = readInt();
            int s = readInt();
            int d = readInt();
            int val = 2*r+3*s+d;
            arr[i] = new pair(val, a);
        }
        Arrays.sort(arr);
        /*
        for(int i = 0; i<n; i++){
            System.out.println(arr[i].name + " " + arr[i].val);
        }*/
        if(n >= 2) {
            System.out.println(arr[n - 1].name);
            System.out.println(arr[n - 2].name);
        } else if(n == 1){
            System.out.println(arr[0].name);
        }
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