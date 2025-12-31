package seolhee._0주차;

import java.util.Arrays;
import java.util.Collections;

/*
외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
[1, 2, 3, 4, 5, 6, 7] => [7, 6, 5, 4, 3, 2, 1]
[30, 10, 23, 6, 100] => [2, 4, 3, 5, 1]
 */
public class ArrayProblem02 {
    public static int[] solution(int[] emergency) {
        int[] answer = {};

        Integer[] arr = new Integer[emergency.length];
        for(int i = 0; i< emergency.length; i++){
            arr[i] = emergency[i];
        }
        Arrays.sort(arr, Collections.reverseOrder()); // 역순 정렬

        answer = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(emergency[i] == arr[j]){
                    answer[i] = j+1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // 테스트 케이스
        //int[] emergency = {3, 76, 24};
        //int[] emergency = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency = {30, 10, 23, 6, 100};
        int[] result = solution(emergency);

        System.out.println(Arrays.toString(result));
    }
}
