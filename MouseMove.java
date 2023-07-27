import java.util.*;
import java.io.*;
public class MouseMove {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int maxX = readInt();
        int maxY = readInt();
        int curX = 0;
        int curY = 0;
        int x = readInt();
        int y = readInt();
        while(x != 0 || y != 0){
            curX += x;
            curY += y;
            if(curX > maxX){
                curX = maxX;
            } else if(curX<0){
                curX = 0;
            }
            if(curY > maxY){
                curY = maxY;
            } else if(curY < 0){
                curY = 0;
            }
            System.out.println(curX + " " + curY);
            x = readInt();
            y = readInt();
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












