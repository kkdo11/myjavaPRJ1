import java.util.Scanner;

public class Bj2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("숫자 입력 :");
        int n;
        int i;

        n = s.nextInt();
        s.close();

        for (i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
