import java.util.Scanner;

public class Bj10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();

        s.close();

        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println(sum);


    }
}