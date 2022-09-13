package TEST;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_0826_1 {
        public static void main(String[] args) {
            Java_0826_1 j = new Java_0826_1();
            int [] arr = {5, 9, 7, 10};
        }

        public int[] solution(int[] arr, int divisor){
            ArrayList<Integer> list = new ArrayList<Integer>(); // ! ArrayList 배열 생성 변수타입은 integer

            for (int i = 0; i < arr.length; i++) { //int가 i이고, arr.length만큼 돌리자!
                if (arr[i] % divisor == 0) { //arr[i]를 divisor로 나누었을 때  나머지가 0이면
                    list.add(arr[i]); //ArrayList에 arr[i]를 넣는다
                }
            }

            if (list.isEmpty()) { //! ArrayList가 비었으면 (0으로 나누어떨어지지않으면)
                list.add(-1); //-1을 list에 넣는다
            }

            int [] answer = new int[list.size()]; //list 사이즈와 동일한 크기의 배열을 생성하다.
            //arraylist는 컬렉션 프레임워크이기 때문에 배열로 반환을 해야돼서 answer라는 배열을 만들어서 출력할겁니다.

            for (int i = 0; i < list.size(); i++) { //int i가 list.size만큼 돌아간다
                answer[i] = list.get(i); //list에 있는 i값을 answer라는 변수에 넣을 거다
                //answer라는 변수의 i번째 수와 list의 i번째 수를 통일해서 answer에 넣을 거다
            }

            Arrays.sort(answer); // !오름차순으로 정렬하기
            return answer;


    }
}
