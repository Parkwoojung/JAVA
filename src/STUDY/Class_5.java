package STUDY;

import static STUDY.HouseDog.housedog;

class Animal_2{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal_1{
    void sleep(){
        System.out.println(this.name + "zzz");
    }
}

class HouseDog extends Dog{
    public static HouseDog housedog; //맨 아래 최신 버전인 클래스를 상속받기 때문에 zzz in house라고 나옴

    void sleep(){
        System.out.println(this.name + "zzz in house");
    }
}

public class Class_5 {

    public static void main(String[] args) {
        housedog = new HouseDog();
        housedog.setName("Boomi");
        housedog.sleep();
    }
}
