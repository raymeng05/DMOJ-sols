import java.util.*;
import java.io.*;
public class BBST {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;


    public static void main(String args[]) throws IOException  {
        int n = readInt();
        char[] arr = readLine().toCharArray();
        Deque<Character> q = new LinkedList<>();
        q.add(arr[0]);
        for(int i = 1; i<n; i++){
            if(arr[i] <= q.peekFirst()){
                q.addFirst(arr[i]);
            } else {
                q.addLast(arr[i]);
            }
        }
        for(int i = 0; i<n; i++){
            Character c = q.poll();
            System.out.print(c);
        }
        System.out.println();
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