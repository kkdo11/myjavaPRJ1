import java.util.Scanner;

public class Ex08_03 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int [] aa=new int[4];
        int hap, i;

        for( i=0;i<4;i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            aa[i] = in.nextInt();
        }
        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf("합계==> %d \n", hap);
    }
}
