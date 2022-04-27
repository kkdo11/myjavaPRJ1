public class Ex08_06 {
    public static void main(String[] args) {
        int aa[]={10,20,30,40,50};
        int count,size;

        count = aa.length;
        size =count* Integer.BYTES;

        System.out.printf("배열 aa[]의 개수는 %d개 입니다 \n",count);
        System.out.printf("배열 aa[]의 전체크기는 %d 바이트입니다 \n",size);

        System.out.println("배열의 크기 :" +count);
        System.out.println("데이터의 크기 :" +size);

        for (int i=0; i< aa.length; i++)
            System.out.println("aa["+i+"] :" +aa[i]);
        //배열의 개수를 알아야 for문 사용가능//


    }
}
