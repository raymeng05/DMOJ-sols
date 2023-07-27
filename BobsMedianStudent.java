import java.util.*;
import java.io.*;
public class BobsMedianStudent {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numStudents = readInt();
        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];
        for(int i = 0; i<numStudents; i++) {
            String line = readLine();
            names[i] = line.substring(0, line.indexOf(" "));
            marks[i] = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
        }

            boolean sorted = false;
            int temp;
            String tem;
            while(!sorted) {
                sorted = true;
                for (int i = 0; i < numStudents-1; i++) {
                    if (marks[i] > marks[i+1]) {
                        temp = marks[i];
                        marks[i] = marks[i + 1];
                        marks[i + 1] = temp;
                        tem = names[i];
                        names[i] = names[i+1];
                        names[i+1] = tem;
                        sorted = false;
                    } else if(marks[i] == marks[i+1]) {
                        if(names[i].compareTo(names[i+1]) > 0){
                            tem = names[i];
                            names[i] = names[i+1];
                            names[i+1] = tem;
                        }

                    }
                }
            }
            System.out.println(names[numStudents/2]);
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



