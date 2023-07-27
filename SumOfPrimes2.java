import java.util.*;
import java.io.*;
public class SumOfPrimes2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = 100000;
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        for (int p = 2; p * p <= n; p++)
        {
                    if (prime[p] == true)
                    {

                        for (int i = p * p; i <= n; i += p)
                            prime[i] = false;
                    }
        }

        int[] arr = new int[100000];
        int j = 0;
                for (int i = 2; i <= n; i++) {
                    if (prime[i] == true) {
                        arr[j] = i;
                        j++;
                    }
                }

                long[] psa = new long[j];
                psa[0] = 2;
                for(int i = 1; i<j; i++){
                    psa[i] = arr[i] + psa[i-1];
                }

                int q = readInt();
                for(int i = 0; i<q; i++){
                    int a = readInt();
                    int b = readInt();
                    int indexSmall = 0;
                    int indexLarge = 0;
                    for(int k = 0; k<j; k++){
                        if(arr[k] >= a){
                            if(k-1 >= 0) {
                                indexSmall = k - 1;
                            } else {
                                indexSmall = k;
                            }
                            break;
                        }
                    }
                    for(int k = a; k<j; k++){
                        if(arr[k] > b){
                            indexLarge = k-1;
                            break;
                        } else if(arr[k] == b){
                            indexLarge = k;
                            break;
                        }
                    }
                    long output = 0;
                    if(indexLarge != indexSmall) {
                         output = psa[indexLarge] - psa[indexSmall];
                    } else {
                        output = psa[indexLarge];
                    }
                    System.out.println(output);
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






