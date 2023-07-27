import java.util.*;
import java.io.*;

public class StarGazing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        ArrayList<Integer> xcoords = new ArrayList<>();
        ArrayList<Integer> ycoords = new ArrayList<>();
        int countRemove = 0;

        xcoords.add(0);
        ycoords.add(0);
        for(int i = 1; i<n; i++){
            int p = readInt()-1;
            int x = readInt();
            int y = readInt();

            int newX = xcoords.get(p) + x;
            int newY = ycoords.get(p) + y;
            boolean contains = false;
            for(int j = 0; j<xcoords.size(); j++){
                if(xcoords.get(j) == newX && ycoords.get(j) == newY){
                    contains = true;
                    break;
                }
            }
            if(contains){
                countRemove++;
            }
                 xcoords.add(i, newX);
                 ycoords.add(i, newY);
        }
        System.out.println(xcoords.size()-countRemove);
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