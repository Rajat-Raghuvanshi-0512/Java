public class _11_Loops {
    public static void main(String[] args) {

        // ______WHILE LOOP_______
        System.out.println("Using Loops:");
        int i = 100;
        while (i <= 200) {
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop!");

        // while(true){
        // System.out.println("I am an infinite while loop!");
        // }

        // ______DO-WHILE LOOP_______
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);

        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= 45);

        // ______FOR LOOP_______
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        // int n = 3;
        // for (int i =0; i<n; i++){
        // System.out.println(2*i+1);
        // }

        for (int y = 5; y != 0; y--) {
            System.out.println(y);
        }
    }
}
