import java.util.Scanner;

public class Ex9_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str;
        str= in.next();
        int len;

        len=str.length();

        System.out.printf("문자열 :%s \n",str);
        System.out.printf("문자열 길이 :%d \n",len);
    }
}
