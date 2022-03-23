public class Ex04_04 {
    public static void main(String[] args) {
        int a=10,b;

        b=a++;
        System.out.printf("%d \n" ,b);
        //a+1 하기전에 b에먼저 a 값을 저장하고 a+1 실행//


        b=++a;
        System.out.printf("%d \n" , b);
        //a+1먼저하고 a값을 저장
    }
}
