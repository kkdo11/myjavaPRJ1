import java.util.*;
public class Quiz0518 {
    public static void main(String[] args) {

        List <Map<String,String>> list= new ArrayList<>();//메모리에 올림

        Map<String,String > map= new HashMap<>();
        map.put("name","이협건");
        map.put("dept","데이터 분석");

        list.add(map);

        map=null;

        map= new HashMap<>();
        map.put("name","홍길동");
        map.put("dept","정보보안");

        list.add(map);

        map=null;

//        List<String>list2=new ArrayList<>();
//        list2.add("이협건");
//        list2.add("홍길동");
//
//        for (String name: list2){
//            System.out.println("name:"+name);


        list.forEach(rmap->{
            System.out.println(rmap.get("name"));
            System.out.println(rmap.get("dept"));
        });





    }
}
