import java.util.*;
import java.io.*;
class Pairr{
    Integer x;
    Integer y;

    public Pairr(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
}
public class DirectedGraphConnectivity {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static boolean bfs(List<Integer> arr[]){
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        boolean visit = false;
        while(!q.isEmpty()){
            int cur = q.poll();
                for(int nxt: arr[cur]){
                    if(!visited[nxt]) {
                        q.add(nxt);
                        visited[nxt] = true;
                    }
                }
                if(visited[n]){
                    visit = true;
                    break;
                }
        }
        return visit;
    }
    public static void main(String[] args) throws IOException {
        n = readInt();
        int m = readInt();
        List<Integer>arr[] = new ArrayList[n+1];
        Pairr[] holder = new Pairr[m];
        for(int i = 0; i<n+1; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i<m; i++){
            int x = readInt();
            int y = readInt();
            holder[i] = new Pairr(x, y);
            arr[x].add(y);
        }
        for(int i = 0; i<m; i++){
            Integer x = holder[i].x;
            Integer y = holder[i].y;
            arr[x].remove(y);
            boolean possible = bfs(arr);
            if(possible){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            arr[x].add(y);
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





