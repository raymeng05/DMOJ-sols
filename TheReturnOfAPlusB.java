import java.util.*;
import java.io.*;
public class TheReturnOfAPlusB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.println(num1 + num2);
        }
    }
}

