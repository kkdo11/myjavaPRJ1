import java.util.Scanner;

public class Quiz {
    //Q1. 내가 입력한 숫자가 홀인지 짝인지 출력해주는 프로그램
    //내가 입력한 숫자가 3의 배수인지 5의 배수인지 출력해주는 프로그램


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("숫자 입력");
        a = s.nextInt();

        if (a % 2 == 1)
            System.out.printf("홀 \n");
        else
            System.out.printf("짝 \n");


        System.out.printf("숫자 입력 \n");
        a = s.nextInt();

        if ((a % 3 == 0) && (a % 5 == 0))
            System.out.printf("3과 5의 배수를 모두 만족합니다 ");
        else if (a % 5 == 0)
            System.out.printf("5의배수 입니다 ");
        else if (a % 3 == 0)
            System.out.printf("3의배수 입니다 ");

        /*if((a%3==0)&&(a%5==0))
            System.out.printf("3과 5의 배수를 모두 만족합니다 ");
        else
        if(a%5==0)
            System.out.printf("5의배수 입니다 ");
        else
        if(a%3==0)
            System.out.printf("3의배수 입니다 ");
*/
    }
}
