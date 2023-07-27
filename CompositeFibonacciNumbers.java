import java.util.*;
import java.io.*;
public class CompositeFibonacciNumbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class pair{
        int endInd;
        int count;

        public pair(int endInd, int count){
            this.endInd = endInd;
            this.count = count;
        }
    }

    public static void main(String args[]) throws IOException  {
        int t = readInt();
        Set<Integer> fibb = new HashSet<>();
        int first = 0;
        int second = 1;
        fibb.add(0);
        fibb.add(1);
        while(second < 1e5){
            int next = first+second;
            fibb.add(next);
            first = second;
            second = next;
        }
        //System.out.println(fibb);
        for(int i = 0; i<t; i++){
            String s = readLine();
            int length = s.length();
            ArrayList<String>[] adj = new ArrayList[length];
            boolean possible = false;
            for(int j = 0; j<length; j++){
                adj[j] = new ArrayList<>();
            }
            for(int j = 0; j<length; j++){
                for(int k = j+1; k<=length; k++){
                    if(fibb.contains(Integer.parseInt(s.substring(j, k)))){
                        adj[j].add(s.substring(j, k));
                    }
                }
            }
            Queue<pair> q = new LinkedList<>();
            for(String nxt:adj[0]){
                if(nxt.length() < length) {
                    q.add(new pair(nxt.length(), 1));
                }
            }
            while(!q.isEmpty()){
                pair cur = q.poll();
                int ind = cur.endInd;
                for(String nxt:adj[ind]){
                    int l = nxt.length();
                    if(ind + l < length){
                        q.add(new pair(ind+l, cur.count+1));
                    } else if(ind+l == length && cur.count+1 >= 2){
                        possible = true;
                        break;
                    }
                }
                if(possible){
                    break;
                }
            }


            if(possible){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
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