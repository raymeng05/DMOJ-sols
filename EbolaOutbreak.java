import java.util.*;
import java.io.*;
public class EbolaOutbreak {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int[] parent;
    static int findParent(int p){
        if(p != parent[p]){
            parent[p] = findParent(parent[p]);
        }
        return parent[p];
    }
    public static void main(String[] args) throws IOException {
        int numPeople = readInt();
        int numClasses = readInt();
        parent = new int[numPeople+1];
        for(int i = 1; i<=numPeople; i++){
            parent[i] = i;
        }
        for(int i = 0; i<numClasses; i++){
            int numPeeps = readInt();
            int firstStudent = readInt();
            for(int j = 1; j<numPeeps; j++){
                int student = readInt();
                int rootA = findParent(firstStudent);
                int rootB = findParent(student);
                if(rootA != rootB){
                    parent[rootB] = parent[rootA];
                }
            }
        }
        int parentInfected = findParent(1);
        ArrayList<Integer> infected = new ArrayList<>();
        for(int i = 1; i<=numPeople; i++){
            int par = findParent(i);
            if(par == parentInfected){
                infected.add(i);
            }
        }
        System.out.println(infected.size());
        for(int i = 0; i<infected.size(); i++){
            System.out.print(infected.get(i) + " ");
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





