import java.util.Scanner;

public class Ex8_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int aa[] = new int[4];

        int hap;

        System.out.printf("1번째 숫자를 입력하세요 :");
        aa[0] = in.nextInt();
        System.out.printf("2번째 숫자를 입력하세요 :");
        aa[1] = in.nextInt();
        System.out.printf("3번째 숫자를 입력하세요 :");
        aa[2] = in.nextInt();
        System.out.printf("4번째 숫자를 입력하세요 :");
        aa[3] = in.nextInt();
        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf("%d \n", hap);

        for(int i=0; i<4; i++) {
            System.out.println("aa[" + i + "] =" + aa[i]);
        }
    }
}
