import java.util.*;
import java.io.*;
public class KaguyaStudentCouncil {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int k;



    public static void main(String args[]) throws IOException  {
        int n = readInt();
        k = readInt();
        int[][] arr = new int[n][k];
        int[] inDegree = new int[k];
        ArrayList<Integer>[] adj = new ArrayList[k];
        Map<Integer, Integer>[] indexes = new HashMap[k];
        for(int i = 0; i<k; i++){
            adj[i] = new ArrayList<>();
            indexes[i] = new HashMap<>();
        }

        for(int i = 0; i<n; i++){
            String s = readLine();
            for(int j = 0; j<k; j++){
                arr[i][j] = s.charAt(i)-65;
                indexes[i].put(arr[i][j], j);
            }
        }


        for(int i = 0; i<k-1; i++){
            for(int j = i+1; j<k; j++){
                boolean consistent = true;
                boolean less = true; //based if i<j or i is ranked higher than j
                if(indexes[0].get(i)>indexes[0].get(j)){
                    less = false;
                }
                for(int p = 1; p<n; p++){
                    if(less && indexes[p].get(i) < indexes[p].get(j) || !less && indexes[p].get(i)>indexes[p].get(j)){
                        continue;
                    }
                    consistent = false;
                    break;
                }
                if(consistent){
                    if(less){
                        adj[i].add(j);
                        inDegree[j]++;
                    } else {
                        adj[j].add(i);
                        inDegree[i]++;
                    }
                }
            }
        }
        Queue<Integer> temp = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<k; i++){
            if(inDegree[i] == 0){
                temp.add(i);
                q.add(i);
            }
        }
        while(!temp.isEmpty()){
            int cur = temp.poll();
            for(int nxt:adj[cur]){
                inDegree[nxt]--;
                if(inDegree[nxt] == 0){
                    temp.add(nxt);
                    q.add(nxt);
                }
            }
        }
        int[] dist = new int[k];
        Arrays.fill(dist, -1);
        int first = q.peek();
        dist[first] = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            if(dist[cur] != -1){
                for(int nxt:adj[cur]){
                    if(dist[nxt] < dist[cur]+1){
                        dist[nxt] = dist[cur]+1;
                    }
                }
            }
        }
        int max = -1;
        for(int i = 0; i<k; i++){
            max = Math.max(max, dist[i]);
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