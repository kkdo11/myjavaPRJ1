class Car3{
    String color;
    int speed;

    void upSpeed(int value){
        speed = speed + value;
    }

    void downSpeed(int value){
        speed = speed =value;
    }
}

class Sedan extends Car3{
    int seatNum;

    int getSeatNum(){
        return seatNum;
    }
}

class Truck extends Car3{
    int capacity;

    int getCapacity(){
        return capacity;
    }
}

public class Ex12_1 {
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan();
        Truck truck1 = new Truck();

        sedan1.upSpeed(300);
        truck1.upSpeed(100);

        sedan1.seatNum=5;
        truck1.capacity=50;

        System.out.println("세단속도 : " + sedan1.speed+"세단의 좌석수 : " + sedan1.seatNum);
//        System.out.println("세단의 좌석수 : " + sedan1.seatNum);
        System.out.println("트럭의 속도 : "+ truck1.speed+"트럭의 적재량 : "+ truck1.capacity);
//        System.out.println("트럭의 적재량 : "+ truck1.capacity);
    }
}