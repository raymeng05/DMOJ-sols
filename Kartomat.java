import java.util.*;
import java.io.*;

public class Kartomat {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        ArrayList<String> arr = new ArrayList<>();
        char[][] keyboard = new char[4][8];
        for(int r = 0; r<4; r++){
            for(int c = 0; c<8; c++){
                keyboard[r][c] = '*';
            }
        }
        for(int i = 0; i<n; i++){
            arr.add(next());
        }
        String s = next();
        for(int i = 0; i<n; i++){
            if(arr.get(i).indexOf(s) == 0){
                char a = arr.get(i).charAt(s.length());
                int k = a-62;
                int row = k/8;
                int column = k%8;
                keyboard[row][column] = a;
            }
        }
        for(int r = 0; r<4; r++){
            for(int c = 0; c<8; c++){
                System.out.print(keyboard[r][c]);
            }
            System.out.println();
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






