package TEST;

import java.util.Scanner;

public class Java_0915_3003 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int arr [] = {1,1,2,2,2,8};
            for (int i = 0; i < arr.length; i++){
                arr[i] = arr[i] - sc.nextInt();
            }
            for (int i = 0; i <arr.length; i++) {
                System.out.printf("%d ", arr[i]);
            }

        }
    }

