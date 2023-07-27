import java.util.*;
import java.io.*;
 class pair {
    int sortIndex;
    int orderIndex;

    pair(int sortIndex, int orderIndex) {
        this.sortIndex = sortIndex;
        this.orderIndex = orderIndex;

    }

    static class indexComparator implements Comparator<pair> {
        public int compare(pair a, pair b) {
            if (a.sortIndex != b.sortIndex) {
                return Integer.compare(a.sortIndex, b.sortIndex);
            } else {
                return Integer.compare(a.orderIndex, b.orderIndex);
            }
        }
    }
}
public class WritingTheCCC {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int t = readInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 1; i<=t; i++){
            map.put(next(), i);
        }

        int n = readInt();
        pair[] arr = new pair[n];

        for(int i = 0; i<n; i++){
            String word = next();
            arr[i] = new pair(map.get(word), i+1);
        }
        Arrays.sort(arr, new pair.indexComparator());
        for(int i = 0; i<n; i++){
            System.out.println(arr[i].orderIndex);
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





