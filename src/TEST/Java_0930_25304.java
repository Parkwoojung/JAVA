package TEST;

import java.util.Scanner;

public class Java_0930_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hap = sc.nextInt();

        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            hap -= a * b;
        }
        if (hap == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
