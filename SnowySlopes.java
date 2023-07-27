import java.util.*;
import java.io.*;
public class SnowySlopes {
    static class pair{
        int x;
        int y;
        public pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static long calc(int x, int y, int k, int d){
        int val = k*x - d*y;
        return val;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numEndpoints = readInt();
        int numSteeps = readInt();
        pair[] arr = new pair[numEndpoints];
        ArrayList<pair> slopes = new ArrayList<>();
        for(int i = 0; i<numEndpoints; i++){
            int x = readInt();
            int y = readInt();
            arr[i] = new pair(x, y);
        }
        for(int i = 0; i<numSteeps; i++){
            int k = readInt();
            int d = readInt();
            slopes.add(new pair(k, d));
        }
        for(int i = 0; i<slopes.size()-1; i++){
            for(int j = i+1; j<slopes.size(); j++){
                double ratioX = (double)slopes.get(i).x/slopes.get(j).x;
                double ratioY = (double)slopes.get(i).y/slopes.get(j).y;
                if(ratioX == ratioY){
                    slopes.remove(j);
                }
            }
        }

        long counter = 0;
        for(int i = 0; i<slopes.size(); i++){
            int k = slopes.get(i).x;
            int d = slopes.get(i).y;
            Map<Long, Integer> map = new HashMap<>();
            for(int j = 0; j<numEndpoints; j++){
                long val = calc(arr[j].x, arr[j].y, k, d);
                if(!map.containsKey(val)){
                    map.put(val, 1);
                } else {
                    map.replace(val, map.get(val)+1);
                }
                System.out.println(val + " " + map.get(val));
            }
            System.out.println();
            Set<Long> s = map.keySet();
            for(Long p:s){
                int frequency = map.get(p);
                counter += (frequency*(frequency-1)/2);
            }
        }
        System.out.println(counter);

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