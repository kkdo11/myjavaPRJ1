import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int g = s.nextInt();
        int b = s.nextInt();
        int n = 0;
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < g; k++) {
                for (int j = 0; j < b; j++) {
                    System.out.printf("%d %d %d\n", i, k, j);
                    n += 1;
                }
            }
        }
        System.out.println(n);
    }
}