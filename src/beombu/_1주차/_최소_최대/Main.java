package beombu._1주차._최소_최대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

/**
 * 백준 예시
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // ===== 로컬 테스트 (제출 시 주석 처리) =====
        testLocal();
        if (true) return; // 로컬 테스트만 실행
        // ==========================================

        // ===== 백준 제출용 코드 =====
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = solution(br);
        System.out.println(result);
    }

    // 로컬 테스트용
    private static void testLocal() throws IOException {
        int testCase = 0;

        // 테스트 1
        {
            String input = "5\n20 10 35 30 7";
            BufferedReader br = new BufferedReader(new StringReader(input));

            String expected = "7 35";
            String result = solution(br);
            System.out.printf("Test %d: %s %s (expected: %s)%n",
                    ++testCase, result.equals(expected) ? "Success!" : "Fail!", result, expected);
        }

        // 테스트 2
        {
            String input = "3\n1 2 3";
            BufferedReader br = new BufferedReader(new StringReader(input));

            String expected = "1 3";
            String result = solution(br);
            System.out.printf("Test %d: %s %s (expected: %s)%n",
                    ++testCase, result.equals(expected) ? "Success!" : "Fail!", result, expected);
        }
    }

    private static String solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(arr);

        return arr[0] + " " + arr[arr.length - 1];
    }
}