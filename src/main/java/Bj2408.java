import java.util.Scanner;

public class Bj2408 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if ((a == b) && (b == c) && (a == c)) {
            System.out.printf("10000+a*1000 \n");
        } else if ((a == c) || (a == b)) {
            System.out.printf("1000+a*100 \n");

        } else if ((a != b) && (b != c) && (a != c)){
            System.out.printf("");
        }


}
}
