import java.util.*;
import java.io.*;
public class Mispelling {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();
        for(int i = 0; i<numLines; i++){
            String s = sc.next();
            int a = Integer.parseInt(s.substring(0, 1))-1;
            StringBuilder sb = new StringBuilder(s.substring(2));
            int counter = 0;
            while(sb.charAt(a) == ' '){
                a += 1;
            }
            sb.deleteCharAt(a);
            System.out.print(i+1 + " ");
            System.out.print(sb);
            System.out.println();
        }
    }


}

