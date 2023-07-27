import java.util.*;
import java.io.*;
public class DFSTemplate {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        boolean[] visited = new boolean[n+1];
        int[] dist = new int[n+1];
        ArrayList<Integer>[] arr = new ArrayList[n+1];
        for(int i = 1; i<=m; i++){
            int a = readInt();
            int b = readInt();
            arr[a].add(b);
            arr[b].add(a);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        visited[1] = true;
        while(!stack.isEmpty()) {
            int cur = stack.pop();
            for(int nxt: arr[cur]){
                if(!visited[nxt]){
                    stack.push(nxt);
                    visited[nxt] = true;
                }
            }
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





