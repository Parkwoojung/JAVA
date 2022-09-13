package STUDY;

class Calculator_1{
    int sum(int a, int b){
        return a+b;
    }
    int minus(int a, int b){
        return a-b;
    }

    int multi(int a, int b){
        return a*b;
    }
}

public class Calculator{
    public static void main(String[] args) {
        Calculator_1 ca = new Calculator_1();
        System.out.println(ca.sum(3, 2));
        System.out.println(ca.minus(3, 2));
        System.out.println(ca.multi(3,2));
    }

}