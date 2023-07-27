import java.util.*;
import java.io.*;

public class Rovarspraket {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String s = next();
        String output = "";
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < s.length(); i++) {
            output += s.charAt(i);
            if (!vowels.contains(s.charAt(i))) {
                int index = Collections.binarySearch(vowels, s.charAt(i));
                index = (index + 1) * -1;
                if (s.charAt(i) < vowels.get(4)) {
                    int dist1 = vowels.get(index) - s.charAt(i);
                    int dist2 = Math.abs(vowels.get(index - 1) - s.charAt(i));
                    if (dist2 < dist1 || dist1 == dist2) {
                        index--;
                    }
                    output += vowels.get(index);
                    if (dist1 > 1) {
                        output += (char) (s.charAt(i)+1);
                    } else {
                        output += (char) (s.charAt(i) + 2);
                    }
                } else if(s.charAt(i)<'z'){
                    output += vowels.get(4);
                    output += (char) (s.charAt(i)+1);
                } else {
                    output += vowels.get(4);
                    output += 'z';
                }

            }
        }
        System.out.println(output);
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