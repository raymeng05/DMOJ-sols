import java.util.*;
import java.io.*;
public class AssigningPartners {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        Map<String, String> m = new HashMap<>();
        String[] holder = new String[n];
        boolean isBad = false;
        for(int i = 0; i<n; i++){
            holder[i] = next();
        }
        for(int i = 0; i<n; i++){
            m.put(holder[i], next());
        }
        for(int i = 0; i<n; i++){
            String name = m.get(holder[i]);
            if(!m.get(name).equals(holder[i]) || name.equals(holder[i])){
                isBad = true;
                break;
            }
        }
        if(isBad){
            System.out.println("bad");
        } else {
            System.out.println("good");
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











