import java.util.*;
import java.io.*;
public class TreatsCollection {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int houses = readInt();
        int treats = readInt();
        long[] arr = new long[houses+2];
        int startPos = 0;
        for(int i = 1; i<=houses;i++){
            arr[i] = readLong();
        }
        for(int i = 1;i<houses;i++){
            if(arr[i] == 0){
                treats--;
                startPos = i;
                break;
            }
            if(arr[i-1]<=0&&arr[i]>0){
                startPos = i;
            }
        }
        int counter = 0;
        long time = 0;
        long leftValue = 0;
        long rightValue = 0;
        boolean[] visited = new boolean[houses+2];
        int currentPos = startPos;
        if(Math.abs(arr[startPos])>Math.abs(arr[startPos-1])&&arr[startPos-1]!=0)
            currentPos-=1;
        time = Math.abs(arr[currentPos]);
        while(counter<treats){
            visited[currentPos] = true;
            counter++;
            int temp1 = 1;
            while(currentPos-temp1>1){
                if(visited[currentPos-temp1])
                    temp1++;
                else{
                    leftValue = Math.abs(arr[currentPos]-arr[currentPos-temp1]);
                    break;
                }
            }
            int temp2 = 1;
            while(currentPos+temp2<=houses){
                if(visited[currentPos+temp2])
                    temp2++;
                else{
                    rightValue = Math.abs(arr[currentPos]-arr[currentPos+temp2]);
                    break;
                }
            }

            if(rightValue>leftValue&&leftValue!=0){
                currentPos -= temp1;
            }
            else if(rightValue<leftValue&&rightValue!=0){
                currentPos += temp2;
            }
            time+=Math.abs(time-arr[currentPos]);

        }
        System.out.println(time);
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