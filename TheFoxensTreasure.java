import java.util.*;
import java.io.*;
public class TheFoxensTreasure {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int t = readInt();
        for(int i = 0; i<t; i++){
            int n = readInt();
            int[][] holder = new int[n][3];
            for(int j = 0; j<n; j++){
                int a = readInt();
                int s = readInt();
                int o = readInt();
                holder[j][0] = a;
                holder[j][1] = s;
                holder[j][2] = o;
            }
            int numHrs = 0;
            boolean a = true;
            while(a){
                boolean check = true;
                for(int k = 0; k<n; k++) {
                    if ((holder[k][2] % (holder[k][0] + holder[k][1]) >= holder[k][0])) {
                        //System.out.println(numHrs + " " + k + " " + holder[k][2]);
                    } else {
                        //System.out.println(holder[k][0] + holder[k][1]);
                        //System.out.println(numHrs + " " + k + " " + holder[k][2]);
                        check = false;
                        break;
                    }
                }
                if(check || numHrs > 24){
                    break;
                }

                for(int k = 0; k<n; k++){
                    holder[k][2] += 1;
                }

                numHrs++;
            }
            //System.out.println(holder[0][2] + " " + holder[1][2]);
            if(numHrs > 24){
                System.out.println("Foxen are too powerful");
            } else {
                System.out.println(numHrs);
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