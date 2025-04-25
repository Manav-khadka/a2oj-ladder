import java.io.*;
import java.util.*;

public class YoungestPhysicist69A {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();

        int xSum = 0, ySum = 0, zSum = 0;

        while (n-- > 0) {
            xSum += sc.nextInt();
            ySum += sc.nextInt();
            zSum += sc.nextInt();
        }

        if (xSum == 0 && ySum == 0 && zSum == 0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
