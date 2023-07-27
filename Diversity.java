import java.util.*;
import java.io.*;
public class Diversity {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int k = readInt();
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            arr[i] = readInt();
        }
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<k; i++){
            set.add(arr[i]);
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            } else {
                map.replace(arr[i], map.get(arr[i]), map.get(arr[i])+1);
            }
        }
        //System.out.println(map);
        max = set.size();
        for(int i = k; i<n; i++){
            //System.out.println(set);
            if(map.get(arr[i-k])<=1) {
                set.remove(arr[i - k]);
            }
            map.replace(arr[i-k], map.get(arr[i-k]), map.get(arr[i-k])-1);

            set.add(arr[i]);
            if(map.containsKey(arr[i])) {
                map.replace(arr[i], map.get(arr[i]), map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            max = Math.max(max, set.size());
            //System.out.println(max);
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