import java.util.*;
import java.io.*;
public class Q5 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int t = readInt();
        HashMap<String, Integer> map = new HashMap<>();
        long[] arr = new long[n+1];
        String[] names = new String[n];
        for(int i = 1; i<=n; i++){
            String s = next();
            long amount = readLong();
            map.put(s, i);
            arr[i] = amount;
            names[i-1] = s;
        }

        for(int i = 1; i<=t; i++){
            String a = next();
            String b = next();
            long x = readLong();
            if(x > arr[map.get(a)]){
                continue;
            }
            arr[map.get(a)] -= x;
            arr[map.get(b)] += x;
        }
        Arrays.sort(names);
        for(int i = 0; i<n; i++){
            System.out.println(names[i] + " " + arr[map.get(names[i])]);
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