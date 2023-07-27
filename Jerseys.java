import java.util.*;
import java.io.*;

public class Jerseys {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numJerseys = readInt();
        int numPeople = readInt();
        int[] sizes = new int[numJerseys];
        for(int i = 0; i<numJerseys; i++){
            char size = readCharacter();
            int a = 2;
            if(size == 'S'){
                a = 0;
            } else if(size == 'M'){
                a = 1;
            }
            sizes[i] = a;

        }
        int counter = 0;
        for(int i = 0; i<numPeople; i++){
            int size = readCharacter();
            int a = 2;
            if(size == 'S'){
                a = 0;
            } else if(size == 'M'){
                a = 1;
            }
            int index = readInt()-1;
            if(sizes[index] != 'N' && sizes[index] >= a){
                counter++;
                sizes[index] = 'N';
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
