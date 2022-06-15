public class Exam {
    public static void main(String[] args) {
        ExamDTO eDto = new ExamDTO();

        eDto.setTest("기말고사");
        eDto.setScore(100);

        System.out.println(eDto.getTest());
        System.out.println(eDto.getScore());
    }
}
