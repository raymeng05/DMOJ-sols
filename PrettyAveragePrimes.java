import java.util.*;
import java.io.*;
public class PrettyAveragePrimes {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<Integer> arr;
    public static void main(String[] args) throws IOException {
        arr = new ArrayList<>();
        Sieve(10000000);
        int testCases = readInt();
        for(int i = 0; i<testCases; i++){
            int average = readInt();
            int sum = average*2;
            for(int j = 0; arr.get(j)<sum && j<78498; j++){
                int num = arr.get(j);
                int key = sum-num;
                int k = Collections.binarySearch(arr, key);
                if(k>=0){
                    System.out.println(arr.get(k) + " " + num);
                    break;
                }
            }
        }
    }

    static void Sieve(int n){
        boolean prime[] = new boolean[n+1];
        for(int i = 0; i<=n; i++){
            prime[i] = true;
        }
        for(int p = 2; p*p <= n; p++){
            if(prime[p] == true){
                for(int i = p*p; i<=n; i+=p){
                    prime[i] = false;
                }
            }
        }
        int k = 0;
        for(int i = 2; i<=n; i++){
            if(prime[i]){
                arr.add(i);
                k++;
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





