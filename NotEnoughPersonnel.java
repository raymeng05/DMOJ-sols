import java.util.*;
import java.io.*;
public class NotEnoughPersonnel {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numEmployees = readInt();
        String[] names = new String[numEmployees];
        int[] skill = new int[numEmployees];
        for(int i = 0; i<numEmployees; i++){
            String name = next();
            names[i] = name;
            int skillLvl = readInt();
            skill[i] = skillLvl;
        }
        int q = readInt();
        for(int i = 0; i<q; i++){
            int skillLvl = readInt();
            int d = readInt();
            int max = skillLvl+d;
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j<numEmployees; j++){
                if(skill[j]>=skillLvl && skill[j]<=max){
                    temp.add(j);
                }
            }
            //System.out.println(temp);
            if(temp.size() == 0){
                System.out.println("No suitable teacher!");
                continue;
            }
            int bestIndex = temp.get(0);
            for(int j = 1; j<temp.size(); j++){
                if(skill[temp.get(j)]<skill[bestIndex]){
                    bestIndex = temp.get(j);
                }
            }
            System.out.println(names[bestIndex]);

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