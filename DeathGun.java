import java.util.*;
import java.io.*;
public class DeathGun {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
      int m = readInt();
      ArrayList<Integer>[] arr = new ArrayList[m+1];
      String[] holder = new String[m+1];
      int[] inDegree = new int[m+1];
      for(int i = 0; i<m+1; i++){
          arr[i] = new ArrayList<>();
      }
      int index = 0;
      Set<String> set = new HashSet<>();
      Map<String, Integer> map = new HashMap<>();
      for(int i = 0; i<m; i++){
          String x = next();
          String y = next();
          int a;
          int b;
          if(!set.contains(x)){
              set.add(x);
              map.put(x, index);
              holder[index] = x;
              a = index;
              index++;
          } else {
              a = map.get(x);
          }
          if(!set.contains(y)){
              set.add(y);
              map.put(y, index);
              holder[index] = y;
              b = index;
              index++;
          } else {
              b = map.get(y);
          }
          arr[b].add(a);
          inDegree[a]++;
      }
      PriorityQueue<Integer> q = new PriorityQueue<>();
      for(int i = 0; i<m+1; i++){
          if(inDegree[i] == 0){
              q.add(i);
          }
      }
      while(!q.isEmpty()){
          int cur = q.poll();
          if(holder[cur] == null){
              break;
          }
          System.out.println(holder[cur]);
          for(int nxt: arr[cur]){
              inDegree[nxt]--;
              if(inDegree[nxt] == 0){
                  q.add(nxt);
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









