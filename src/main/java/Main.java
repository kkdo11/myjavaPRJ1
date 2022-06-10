import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int d=s.nextInt();
        int n=s.nextInt();
        int sum = a;

        for (int i=1; i<n; i++) {
            sum=sum+ d;
        }
        System.out.println(sum);
    }
}