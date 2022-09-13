package STUDY;

class Animal{
    String name;

    public void setName (String name) {
        this.name = name;
    }
}

public class Class_2 {
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.setName("CAT");
    System.out.println("animal name: " + animal.name);

    Animal dog = new Animal();
    dog.setName("DOG");
        System.out.println("dog's name: " + dog.name);
    }
}
