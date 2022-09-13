package STUDY;

class Updater{
    void update(Counter counter){
        counter.count++;
    }
}

class Counter{
    int count=0;
}
public class Class_4 {
    public static void main(String [] args){
        Counter counter = new Counter();
        System.out.println("before update: " + counter.count);

        Updater updater = new Updater();
        updater.update((counter));
        System.out.print("after update: " + counter.count);
    }

}
