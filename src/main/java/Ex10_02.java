public class Ex10_02 {
    public static void main(String[] args) {
        int aa[] = new int[3];
        try {
            aa[2] = 100 / 0; // 둘다 에러지만 aa[2]가 먼저 에러나서 바로 7행으로 넘어감
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열첨자가 배열크기보다 커요");
            System.out.println("에러메시지" + e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류에요");
            System.out.println("에러메시지 : " + e);
        }catch(Exception e){
            System.out.println("난 모든 애러를다 잡아요");
            System.out.println("에러메시지 : " + e);
        }
        finally {
            System.out.println("이 부분은 무조건 나와요");
        }
    }
}
