public class Ex9_4 {
    public static void main(String[] args) {
        String str=" java를 공부하는중, java는 재밌어요.^^";

        System.out.println("문자열==>"+str);

        System.out.print("제일 처음나오는 java위치==>");
        System.out.println(str.indexOf("java"));
        System.out.print("마지막에 나오는 java위치==>");
        System.out.println(str.lastIndexOf("java"));
    }
}
