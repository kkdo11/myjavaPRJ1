import java.util.Scanner;

public class cdp1089 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();


        for (int i = 1; i < n; i++) {
            a += d;
        }

        System.out.printf("%d", a);

    }
}
