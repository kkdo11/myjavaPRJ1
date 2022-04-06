import java.util.Scanner;

public class Ex05_09_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;


        System.out.println("1~4의 숫자를 입력하세요");
        a = s.nextInt();
        if (a == 1)
            System.out.printf("1을 입력했습니다 \n");
        else if (a == 2)
            System.out.printf("2를 입력했습니다 \n");
        else if (a == 3)
            System.out.printf("3을 입력했습니다 \n");
        else if (a == 4)
            System.out.printf("4를 입력했습니다 \n");
        else
            System.out.printf("숫자를 잘못 입력 \n");
    }
}
