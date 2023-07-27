import java.util.*;
import java.io.*;
public class MilkVisits {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<Integer>[] arr;
    static int numFarms;
    static int componentIndex = 0;
    static int[] component;
    static boolean[] visited;
    static char[] cows;
    static void dfs(int start){
        visited[start] = true;
        for(int nxt: arr[start]){
            if(!visited[nxt] && cows[start] == cows[nxt]){
                component[nxt] = componentIndex;
                dfs(nxt);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        numFarms = readInt();
        int numFriends = readInt();
        arr = new ArrayList[numFarms+1];
        visited = new boolean[numFarms+1];
        component = new int[numFarms+1];
        cows = new char[numFarms+1];
        String s = readLine();
        for(int i = 1; i<=numFarms; i++){
            arr[i] = new ArrayList<>();
            cows[i] = s.charAt(i-1);
        }

        for(int i = 1; i<numFarms; i++){
            int x = readInt();
            int y = readInt();
            arr[x].add(y);
            arr[y].add(x);
        }

        for(int i = 1; i<=numFarms; i++){
            if(!visited[i]){
                component[i] = componentIndex;
                dfs(i);
                componentIndex++;
            }
        }
        for(int i = 0; i<numFriends; i++){
            int x = readInt();
            int y = readInt();
            char c = readCharacter();
            if(component[x] == component[y] && cows[x] != c){
                System.out.print(0);
            } else {
                System.out.print(1);
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