import java.util.*;
import java.io.*;
public class ModeFinding {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        Map<Integer, Integer> m = new HashMap<>();
        int maxIndex = 0;
        for(int i = 0; i<n; i++){
            int num = readInt();
            if(i == 0){
                maxIndex = num;
            }
            if(!m.containsKey(num)){
                m.put(num, 1);
            } else {
                m.replace(num, m.get(num)+1);
            }
        }
        for(int i:m.keySet()){
            if(m.get(i)>m.get(maxIndex)){
                maxIndex = i;
            } else if(m.get(i) == m.get(maxIndex)){
                maxIndex = Math.min(i, maxIndex);
            }
        }
        System.out.println(maxIndex);

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





