import java.util.*;
import java.io.*;
public class TreeShopping2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class points{
        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;

        public points(int x1, int y1, int x2, int y2, int x3, int y3){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }

    }

    static double calcArea(int x1, int y1, int x2, int y2, int x3, int y3){
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int q = readInt();
        double[] areas = new double[n];
        points[] arr = new points[n];
        for(int i = 0; i<n; i++){
            int x1 = readInt();
            int y1 = readInt();
            int x2 = readInt();
            int y2 = readInt();
            int x3 = readInt();
            int y3 = readInt();
            areas[i] = calcArea(x1, y1, x2, y2, x3, y3);
            arr[i] = new points(x1, y1, x2, y2, x3, y3);
            //System.out.println(arr[i].x1 + " " + arr[i].y1);
            //System.out.println(arr[i].x2 + " " + arr[i].y2);
            //System.out.println(arr[i].x3 + " " + arr[i].y3);
            //System.out.println("HI");
        }

        int[] xi = new int[q];
        int[] yi = new int[q];
        for(int i = 0; i<q; i++){
            int x = readInt();
            int y = readInt();
            xi[i] = x;
            yi[i] = y;
        }
        int[] output = new int[q];

        for(int i = 0; i<q; i++){
            System.out.println(output[i]);
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





