import java.util.*;
import java.io.*;
public class AnagramChecker {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String s = readLine();
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            if(a>=65 && a<=90){
                if(!m.containsKey(a)){
                    m.put(a, 1);
                } else {
                    m.put(a, m.get(a)+1);
                }
            }
        }
        Set copy = m.keySet();
        String next = readLine();
        Map<Character, Integer> newM = new HashMap<>();
        for(int i = 0; i<next.length(); i++){
            char a = next.charAt(i);
            if(a>=65 && a<=90){
                if(!newM.containsKey(a)){
                    newM.put(a, 1);
                } else {
                    newM.put(a, newM.get(a)+1);
                }
            }
        }
        boolean isAnagram = true;
        for(Object a: copy){
            if(!m.get(a).equals(newM.getOrDefault(a, -1))){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Is an anagram.");
        } else {
            System.out.println("Is not an anagram.");
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












