import java.util.*;
import java.io.*;
public class LeastWord {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class compareWords implements Comparator<String>{
        public int compare(String a, String b){
            return a.compareTo(b);
        }
    }

    public static void main(String[] args) throws IOException{
        int n = readInt();
        int l = readInt();
        String[] arr = new String[n];
        for(int i = 0; i<n; i++){
            String a = readLine();
            for(int j = 0, k = l-1; j<l; j++, k--){
                if(j == l-1){
                    arr[i] = a;
                    break;
                }
                if(a.charAt(j) == a.charAt(k)){
                    continue;
                }
                if(a.charAt(j)<a.charAt(k)){
                    arr[i] = a;
                } else {
                    arr[i] = new StringBuilder(a).reverse().toString();
                }
                break;
            }
        }

        Arrays.sort(arr, new compareWords());
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]);
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





