import java.util.*;
import java.io.*;
public class SecretSanta {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numPresents = readInt();
        int[] floor = new int[numPresents];
        int[] weight = new int[numPresents];
        int stress = 0;
        int totalWeight = 0;
        for(int i = 0; i<numPresents; i++){
            floor[i] = readInt();
            weight[i] = readInt();
            totalWeight += weight[i];
        }
        boolean sorted = false;
        int temp;
        int tem;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < numPresents-1; i++) {
                if (weight[i]>weight[i+1]) {
                    temp = weight[i];
                    weight[i] = weight[i + 1];
                    weight[i + 1] = temp;
                    tem = floor[i];
                    floor[i] = floor[i+1];
                    floor[i+1] = tem;
                    sorted = false;
                }
            }
        }
        int currentFloor = 101;
        for(int i = numPresents-1; i>=0; i--) {
            int floorNumber = floor[i];
            if (i != 0 && weight[i] != weight[i - 1]){
            stress += totalWeight * (Math.abs((floorNumber - currentFloor)) + 1);
            currentFloor = floorNumber;
            totalWeight -= weight[i];
            } else if(weight[i] == weight[i-1]){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                for(int j = 0; j<i; j++){
                    if(weight[i] == weight[j]) {
                        arr.add(j);
                    } else {
                        break;
                    }
                }
                int min = Integer.MAX_VALUE;
                for(int j = 0; j<arr.size(); j++){
                    if(Math.abs(floorNumber - floor[arr.get(j)])<min){
                        min = Math.abs(floorNumber - floor[arr.get(j)]);
                    }
                }
            }
        }
        System.out.println(stress);
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






