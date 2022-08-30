import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();

        if (a+b+c+d==0)
            System.out.println("모");
        else if (a+b+c+d==1)
            System.out.println("도");
        else if (a+b+c+d==2)
            System.out.println("개");
        else if (a+b+c+d==3)
            System.out.println("걸");
        else if (a+b+c+d==4)
            System.out.println("윷");
    }
}