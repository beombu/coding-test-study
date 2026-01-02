package beombu._1주차.배열만들기;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    static int testCase = 0;

    public static void main(String[] args) {
        {
            int[] emergency = {3, 76, 24};

            int[] expected = {3, 1, 2};
            int[] result = solution(emergency);

            System.out.printf("Test %d: %s %s (expected: %s)%n",
                    ++testCase,
                    Arrays.equals(result, expected) ? "Success!" : "Fail!",
                    Arrays.toString(result),
                    Arrays.toString(expected));
        }

        {
            int[] emergency = {1, 2, 3, 4, 5, 6, 7};

            int[] expected = {7, 6, 5, 4, 3, 2, 1};
            int[] result = solution(emergency);

            System.out.printf("Test %d: %s %s (expected: %s)%n",
                    ++testCase,
                    Arrays.equals(result, expected) ? "Success!" : "Fail!", // 배열 내용 비교
                    Arrays.toString(result),   // 배열을 문자열로 변환
                    Arrays.toString(expected)); // 배열을 문자열로 변환
        }

    }


    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int[] temp = emergency.clone(); //순서를 비교할 배열
        temp = Arrays.stream(temp)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if(temp[i] == emergency[j]) { //비교할 값 == 순차할 값
                    answer[j] = i + 1;
                    break;
                }
            }
        }

        return answer;
    }
}
