package beombu.example._0주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 백준 예시
 */
public class Main {
    static Stack<Character> stack = new Stack<>();
    static int T;

    public static void main(String[] args) throws IOException {
        // ===== 로컬 테스트 (제출 시 주석 처리) =====
        testLocal();
        if (true) return; // 로컬 테스트만 실행
        // ==========================================

        // ===== 백준 제출용 코드 =====
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            System.out.println(solution(str));
            stack.clear();
        }
    }

    // 로컬 테스트용
    private static void testLocal() {
        int testCase = 0;

        // 테스트 1
        {
            String input = "(())())";
            String expected = "NO";
            String result = solution(input);
            System.out.printf("Test %d: %s %s (expected: %s)%n",
                    ++testCase, result.equals(expected) ? "Success!" : "Fail!", result, expected);
            stack.clear();
        }

        // 테스트 2
        {
            String input = "(()())()";
            String expected = "YES";
            String result = solution(input);
            System.out.printf("Test %d: %s %s (expected: %s)%n",
                    ++testCase, result.equals(expected) ? "Success!" : "Fail!", result, expected);
            stack.clear();
        }
    }

    private static String solution(String str) {
        for (char a : str.toCharArray()) {
            if (a == '(') {
                stack.push(a);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}