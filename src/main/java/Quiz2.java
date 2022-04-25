public class Quiz2 {
    public static void main(String[] args) {
        //5! 게산하기

        int f=1;
        int i;


        for( i=5; i>0; i--){
            f =f*i;
            System.out.printf("중간 계산값은 %d \n",f);
        }
        System.out.println("5!값은 "+f);


    }
}
