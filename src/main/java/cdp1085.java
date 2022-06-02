import java.util.Scanner;

public class cdp1085 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();
        double d= in.nextDouble();

        double result=(a*b*c*d)/8/1024/1024;
        System.out.printf("%1f MB",result);
    }
}
