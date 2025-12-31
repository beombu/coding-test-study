package beombu.example._0주차;

import java.util.Arrays;

/**
 * 프로그래머스 예시
 */
class Example {
    static int testCase = 0;

    public static void main(String[] args) {
        {
            int[] people1 = {70, 50, 80, 50};
            int limit1 = 100;

            int expected = 3;
            int result = solution(people1, limit1);

            System.out.printf("Test %d: %s %d (expected: %d)%n",
                    ++testCase, result == expected ? "Success!" : "Fail!", result, expected);
        }

        {
            int[] people2 = {70, 80, 50};
            int limit2 = 100;

            int expected = 3;
            int result = solution(people2, limit2);

            System.out.printf("Test %d: %s %d (expected: %d)%n",
                    ++testCase, result == expected ? "Success!" : "Fail!", result, expected);
        }

    }

    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        int index = people.length - 1;
        for (int i = 0; i <= index; i++, answer++)
            while (index > i && people[i] + people[index--] > limit)
                answer++;

        return answer;
    }
}
