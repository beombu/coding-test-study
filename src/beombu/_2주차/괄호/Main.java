package beombu._2주차.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String result = "NO";
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push('(');
                } else if (str.charAt(j) == ')') {
                    if (stack.isEmpty()) {
                        stack.push('(');
                        break;
                    }

                    stack.pop();
                }
            }

            if(stack.isEmpty()){
                result = "YES";
            }

            System.out.println(result);
        }
    }
}
