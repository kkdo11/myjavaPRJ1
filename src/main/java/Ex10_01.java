public class Ex10_01 {
    public static void main(String[] args) {
        int aa []= new int[3];
        try{
            aa[4]=100;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열첨자가 배열크기보다 커요~~");
            System.out.println("에러메시지" +e);
        }
    }
}
