import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int s=b-c;
        if (s>a){
            System.out.println("advertise");
        }else if(s==a){
            System.out.printf("does not matter");
        }else{
            System.out.printf("do not advertise");
        }
    }
}