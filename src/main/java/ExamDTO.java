import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExamDTO {
    private String test;
    private int score;

    public String getTest() {
        return test;
    }

    public void setTest(String test){

    }
}
