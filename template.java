import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        
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
