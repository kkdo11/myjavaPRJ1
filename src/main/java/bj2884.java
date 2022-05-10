import java.util.Scanner;

public class bj2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h, m;
        h = in.nextInt();
        m = in.nextInt();

        if (m < 45) {
            h--;
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + "" + (m - 45));

        }
    }
}