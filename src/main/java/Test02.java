public class Test02 {

    public static void main(String[] args) {


        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}













/*      Scanner in = new Scanner(System.in);

        int y = in.nextInt();
        in.close();

        if(y%4==0) {
            if(y%400==0) System.out.println("1");
            else if(y%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");*/