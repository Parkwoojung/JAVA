package STUDY;

class Animal_1{
    static String name;

    public void setName(String name) {
        System.out.println("this.name: " + this.name);
        System.out.println("name" + name);
        this.name = name;
        System.out.println("this.name: " + this.name);
        System.out.println("name: " + name);
    }
    }
public class Class_1 {
    public static void main(String[] args) {

        Animal_1 animal = new Animal_1();
        System.out.println(animal.name);
        animal.setName("CAT");
        System.out.println(animal.name);
    }
}
