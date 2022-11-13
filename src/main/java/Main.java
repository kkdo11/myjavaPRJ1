import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a + b > c) {
            if (a == b && a == c) {
                System.out.printf("정삼각형");
            } else if (a == b || a == c || b == c) {
                System.out.printf("이등변삼각형");
            } else if ((a * a + b * b) == (c * c)) {
                System.out.printf("직각삼각형");
            }
            else {
                System.out.printf("삼각형");
            }
        } else {
            System.out.printf("삼각형아님");
        }
    }
}