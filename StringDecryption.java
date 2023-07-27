import java.util.*;
import java.io.*;
public class StringDecryption {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int sum = readInt();
        String s = readLine();
        char[] arr = s.toCharArray();
        int length = arr.length;
        int numAst = 0;
        long curSum = 0;
        char[] output = new char[length];
        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i = 0; i<length; i++){
            if(arr[i] == '*'){
                numAst++;
                indexes.add(i);
            } else {
                curSum += arr[i]-96;
            }
        }
        if(sum-curSum < numAst || sum-curSum > 26*numAst || curSum > sum){
            System.out.println("Impossible");
        } else {
            long remaining = sum-curSum;
            for(int i = 0; i<length; i++){
                //System.out.println(remaining);
                if(arr[i] == '*'){
                    if(s.lastIndexOf('*') == i){
                        long temp = Math.min(26, remaining);
                        if(temp == 26){
                            output[i] = 'z';
                        } else {
                            output[i] = (char)(remaining+96);
                        }
                        remaining -= temp;
                    } else {
                        output[i] = 'a';
                        remaining -= 1;
                    }
                } else {
                    output[i] = arr[i];
                }
            }
            if(remaining != 0){
                //System.out.println(indexes);
                //System.out.println(remaining);
                int l = indexes.size();
                for(int i = l-1; i>=0; i--){
                    int ind = indexes.get(i);
                    //System.out.println(i);
                    if(output[ind] == 'z'){
                        continue;
                    }
                    if(remaining > 25){
                        remaining -= 25;
                        output[ind] = 'z';
                    } else {
                        output[ind] = output[ind] += remaining;
                        remaining = 0;
                        break;
                    }
                }
            }
            for(int i = 0; i<length; i++){
                System.out.print(output[i]);
            }
            System.out.println();
        }
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