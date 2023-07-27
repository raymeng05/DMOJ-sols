import java.util.*;
import java.io.*;
public class FestiveGroups {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
       int n = readInt();
       int[] arr = new int[n];
       for(int i = 0; i<n; i++){
           arr[i] = readInt();
       }

       Arrays.sort(arr);
       int numGroups = 0;
       for(int i = 0; i<n; i++){
           boolean a = false;
           for(int j = i+1; j<n; j++){
               if(arr[i] == -1){
                   a = false;
                   break;
               }
               if(arr[j] == -1){
                   continue;
               }
               if(arr[j]%arr[i] == 0){
                   arr[j] = -1;
                   a = true;
               }
           }
           if(a) {
               numGroups++;
               arr[i] = -1;
           }
       }
       for(int i = 0; i<n; i++){
           if(arr[i] != -1){
               numGroups++;
           }
       }
       System.out.println(numGroups);

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





