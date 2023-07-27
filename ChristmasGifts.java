import java.util.*;
import java.io.*;
import java.lang.*;

public class ChristmasGifts {
    static class Prices {
        int price;
        int tax;

        public Prices(int price, int tax) {
            this.price = price;
            this.tax = tax;
        }
    }
    static class PricesComparator implements Comparator<Prices> {
        public int compare (Prices one, Prices two){
            return Integer.compare(one.tax + one.price, two.price + two.tax);
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numFriends = readInt();
        int amountMoney = readInt();
        Prices[] arr = new Prices[numFriends];
        int[] price = new int[numFriends];
        for (int i = 0; i < numFriends; i++) {
            arr[i] = new Prices(readInt(), readInt());
            price[i] = arr[i].price;
        }
        Arrays.sort(arr, new PricesComparator());

        int counter = 0;
        int count = 0;
        for(int i = 0; i<numFriends; i++){
            int totalPrice = arr[i].price + arr[i].tax;
            if(counter+totalPrice<=amountMoney){
                counter += totalPrice;
                count++;
            } else {
                totalPrice -= arr[i].price/2;
                if(counter + totalPrice <= amountMoney){
                    count++;
                    counter += totalPrice;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
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








