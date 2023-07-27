import java.util.*;
import java.io.*;
public class KeepingScore {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;


    public static void main(String args[]) throws IOException  {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        char[] arr = readLine().toCharArray();
        int length = arr.length;
        ArrayList<Character>[] holder = new ArrayList[4];
        for(int i = 0; i<4; i++){
            holder[i] = new ArrayList<>();
        }
        int[] points = new int[4];
        int curInd = -1;
        for(int i = 0; i<length; i++){
            char cur = arr[i];
            if(cur == 'C' || cur == 'D' || cur == 'H' || cur == 'S'){
                curInd++;
                continue;
            }
            if(cur == 'J'){
                points[curInd]++;
            } else if(cur == 'Q'){
                points[curInd] += 2;
            } else if(cur == 'K'){
                points[curInd] += 3;
            } else if(cur == 'A'){
                points[curInd] += 4;
            }
            holder[curInd].add(cur);
        }
        for(int i = 0; i<4; i++){
            if(holder[i].size()<3){
                points[i] += (3-holder[i].size());
            }
        }
        System.out.println("Cards Dealt              Points");
        String[] names = {"Clubs", "Diamonds", "Hearts", "Spades"};
        for(int i = 0; i<4; i++){
            System.out.print(names[i]);
            for(char nxt:holder[i]){
                System.out.print(" " + nxt);
            }
            System.out.println(" " + points[i]);
        }
        System.out.println("     " + "Total " + (points[0]+points[1]+points[2]+points[3]));
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
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