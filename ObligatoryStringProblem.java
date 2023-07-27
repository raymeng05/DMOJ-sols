import java.util.*;
import java.io.*;
public class ObligatoryStringProblem {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int k = readInt();
        char[] arr = readLine().toCharArray();
        ArrayList<String> output = new ArrayList<>();
        for(int first = 97; first <= 122; first++){
            for(int second = 97; second <= 122; second++){
                for(int third = 97; third <= 122; third++){
                    for(int fourth = 97; fourth <= 122; fourth++){
                        int sum = 0;
                        sum += Math.min(Math.abs(first-arr[0]), Math.abs(26-Math.abs(first-arr[0])));
                        sum += Math.min(Math.abs(second-arr[1]), Math.abs(26-Math.abs(second-arr[1])));
                        sum += Math.min(Math.abs(third-arr[2]), Math.abs(26-Math.abs(third-arr[2])));
                        sum += Math.min(Math.abs(fourth-arr[3]), Math.abs(26-Math.abs(fourth-arr[3])));
                        if(sum <= k){
                            StringBuilder s = new StringBuilder();
                            s.append((char)first);
                            s.append((char)second);
                            s.append((char)third);
                            s.append((char)fourth);
                            output.add(s.toString());
                        }
                    }
                }
            }
        }
        Collections.sort(output);
        for(String s:output){
            System.out.println(s);
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