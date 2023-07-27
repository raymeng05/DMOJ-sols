import java.util.*;
import java.io.*;
public class DaisyChains {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<Integer> flowers;
    public static void main(String[] args) throws IOException {
        int numFlowers = readInt();
        flowers = new ArrayList<>();
        int photos = 0;
        for(int i = 0; i<numFlowers; i++){
            flowers.add(readInt());
        }
        photos += numFlowers;
        for(int i = 0; i<numFlowers-1; i++){
            for(int j = i+1; j<numFlowers; j++){
                photos += averageTrue(i, j);
            }
        }
        System.out.println(photos);


    }
    static int averageTrue(int first, int second){
        double sum = 0;
        for(int i = first; i<=second; i++){
            sum += flowers.get(i);
        }
        double average = sum/((second-first)+1);
        boolean a = false;

        for(int i = first; i<=second; i++){
            if(average == flowers.get(i)){
                a = true;
                break;
            }
        }
        if(a){
            return 1;
        } else {
            return 0;
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





