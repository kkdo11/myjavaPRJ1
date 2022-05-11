import java.util.ArrayList;
import java.util.List;

public class framework {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();//무조건 외우기!!!!!!!!

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize= list.size();

        for (String name : list) {
            System.out.println("이름 :" +name);



    }}
}
