import java.util.*;

public class hashmap2 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();


        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map);

        map = null;//오류를 막기위해 선언



        map = new HashMap<>();//map=null 을 선언해서 필요

        map.put("name", "홍길동");
        map.put("email", "g.go@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        list.add(map);

        map = null;

        int listSize = list.size();//for문을 쓰기위해서는 배열의 개수를 알아야하기 때문


        for (int i = 0; i < listSize; i++) {
            Map rMap = list.get(i);
            System.out.println("------------------------------------");
            System.out.println("name :"  +rMap.get("name"));
            System.out.println("email :" +rMap.get("email"));
            System.out.println("addr :"  +rMap.get("addr"));
            System.out.println("dept :"  +rMap.get("dept"));
        }
    }
}