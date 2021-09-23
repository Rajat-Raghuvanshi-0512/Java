import java.util.*;
import java.io.*;

class text {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(a + 2 * b);
        }
        in.close();
    }
}