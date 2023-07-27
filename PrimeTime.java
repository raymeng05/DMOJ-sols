import java.util.*;
import java.io.*;
public class PrimeTime {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        for(int i = 0; i<5; i++){
            ArrayList<String> holder = new ArrayList<>();
            int num = readInt();
            arr = new int[num+1];
            for(int j = num; j>1; j--){
                primeFactor(j);
            }
            for(int j = 2; j<=num; j++){
                if(arr[j] > 0){
                    holder.add(j + "^" + arr[j] + " * ");
                }
            }
            for(int j = 0; j<holder.size(); j++){
                if(j == holder.size()-1){
                    System.out.println(holder.get(j).substring(0, holder.get(j).length()-3));
                } else {
                    System.out.print(holder.get(j));
                }
            }
        }
    }

    static void primeFactor(int n){
        while(n%2 == 0){
            arr[2]++;
            n /= 2;
        }
        for(int i = 3; i<=Math.sqrt(n); i+=2){
            while(n%i == 0){
                arr[i]++;
                n/=i;
            }
        }

        if(n>2){
            arr[n]++;
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





