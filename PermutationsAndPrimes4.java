import java.util.*;
import java.io.*;
public class PermutationsAndPrimes4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int t = readInt();
        for(int i = 0; i<t; i++){
            int n = readInt();
            StringBuilder output = new StringBuilder();
            String s = String.valueOf(n);
            if(n == 2){
                System.out.println(-1);
                continue;
            } else if(n == 4){
                System.out.println("2 4 1 3");
                continue;
            }
            char lastDigit = s.charAt(s.length()-1);
            if(n%10 == 0 || lastDigit == '6' || lastDigit == '4'){
                int cur = 0;
                int numTimes = n/5;
                if(lastDigit == '6' || n%10 == 0){
                    cur = n;
                    output.append(cur);
                } else if (lastDigit == '4'){
                    cur = n-2;
                    output.append(cur);
                    output.append(" ").append(cur+2);
                    cur += 2;
                    cur -= 3;
                    output.append(" ").append(cur);
                    cur += 2;
                    output.append(" ").append(cur);
                    cur -= 3;
                    output.append(" ").append(cur);
                    for(int j = 0; j<numTimes; j++){
                        for(int k = 0; k<5; k++){
                            if(k%2 == 0){
                                cur -= 3;
                            } else {
                                cur += 2;
                            }
                            if(cur <= 0){
                                break;
                            }
                            output.append(" ").append(cur);
                        }
                    }
                    System.out.println(output);
                    continue;
                }
                for(int j = 0; j<numTimes; j++){
                    for(int k = 0; k<5; k++){
                        if(k%2 == 0){
                            cur -= 3;
                        } else {
                            cur += 2;
                        }
                        if(cur <= 0){
                            break;
                        }
                        output.append(" ").append(cur);
                    }
                }
                System.out.println(output);
            }  else {
                output.append(n-2);
                int numTimes = n/4;
                int cur = n-2;
                for(int j = 0; j<numTimes; j++){
                    for(int k = 0; k<4; k++){
                        if(k == 3 && cur > 5){
                            cur -= 5;
                        } else if(k%2 == 0){
                            cur += 2;
                        } else {
                            cur -= 3;
                        }
                        if(cur <= 0){
                            break;
                        }
                        output.append(" ").append(cur);
                    }
                }
                System.out.println(output);
            }
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