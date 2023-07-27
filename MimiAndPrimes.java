import java.util.*;
import java.io.*;
public class MimiAndPrimes {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<Long> primes;
    static long largestPrime;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        long[] arr = new long[n];
        primes = new ArrayList<>();
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for(int i = 0; i<n; i++){
            arr[i] = readLong();
        }
        long highestGcd = findGCD(arr, n);
        primeFactors(highestGcd);
        if(primes.size() == 0){
            System.out.println("DNE");
        } else {
            System.out.println(largestPrime);
        }
    }

    static long gcd(long a, long b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    static long findGCD(long arr[], int length){
        long num = 0;
        for(long element: arr){
            num = gcd(num, element);
            if(num == 1){
                return 1;
            }
        }
        return num;
    }

    public static void primeFactors(long n){
        largestPrime = -1;
        while(n%2 == 0){
            largestPrime = 2;
            primes.add((long) 2);
            n/=2;
        }
        for(int i = 3; i<=Math.sqrt(n); i+=2){
            while(n%i == 0){
                largestPrime = Math.max(i, largestPrime);
                primes.add((long)i);
                n/=i;
            }
        }
        if(n>2){
            primes.add(n);
        }
        largestPrime = Math.max(n, largestPrime);


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









