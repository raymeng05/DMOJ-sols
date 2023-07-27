import java.util.*;
import java.io.*;
public class SnakesAndLadders {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int move = readInt();
        int currentSquare = 1;
        while(move != 0){
                currentSquare += move;
                switch(currentSquare){
                    case 9: currentSquare = 34; break;
                    case 40: currentSquare = 64; break;
                    case 67: currentSquare = 86; break;
                    case 54: currentSquare = 19; break;
                    case 90: currentSquare = 48; break;
                    case 99: currentSquare = 77; break;
                }
                if(currentSquare > 100){
                    currentSquare -= move;
                }
                System.out.println("You are now on square " + currentSquare);
                if(currentSquare == 100){
                    System.out.println("You Win!");
                    break;
                }
            move = readInt();
        }
        if(move == 0){
            System.out.println("You Quit!");
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