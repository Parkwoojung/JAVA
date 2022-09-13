package STUDY;

class Sample{
    int varTest(int a){
        a++;
        return a;
    }
}
public class Class_3 {
    public static void main(String[] args) {
        Sample sample = new Sample();
        int a = 1;
        a = sample.varTest(a); //class sample에 있는 varTest라는 메소드를 사용하겠다
        System.out.println(a);
    }
}
