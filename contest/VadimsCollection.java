package contest;
import java.util.*;
import java.io.*;

public class VadimsCollection{
    public static void main(String[] args){
      FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        while(n-- > 0){
            String s = sc.next();
            StringBuilder  s1 = new StringBuilder(s);
            String s2="";
            for(int i=0;i<s.length();i++){
                String num = (9-i)+"";
                if(s1.indexOf(num) != -1){
                    s2+= num;
                    s1.replace(s1.indexOf(num), s1.indexOf(num)+1, "");
                } else if(s1.indexOf(s2.charAt(i-1)+"") != -1){
                    s2+= s2.charAt(i-1)+"";
                    s1.replace(s1.indexOf(s2.charAt(i-1)+""), s1.indexOf(s2.charAt(i-1)+"")+1, "");
                } else {
                    s2+= min(Integer.parseInt(s1.toString()))+"";
                    
                    s1.replace(s1.indexOf(min(Integer.parseInt(s1.toString()))+""), s1.indexOf(min(Integer.parseInt(s1.toString()))+"")+1, "");
                }
                
            }
            System.out.println(s2);


        }
    }
    static int minExcludeZero(int a){
        int min = Integer.MAX_VALUE;
        while(a > 0){   
            int d = a % 10;
            if(d != 0 && d < min){
                min = d;
            }
            a /= 10;
        }
        return min;
    }
    
    
    static int min(int a){
        return minExcludeZero(a);
    }


    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        // Method to get next token from the input stream
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        // Method to read the next integer
        int nextInt() {
            return Integer.parseInt(next());
        }

        // Method to read the next long
        long nextLong() {
            return Long.parseLong(next());
        }

        // Method to read the next string
        String nextString() {
            return next();
        }

        // Method to read an integer array
        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
        int[][] nextIntMatrix(int rows, int cols) {
            int[][] mat = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat[i][j] = nextInt();
                }
            }
            return mat;
        }
        

        // Method to read a long array
        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        // Method to read a string array
        String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextString();
            }
            return arr;
        }
    }
}

