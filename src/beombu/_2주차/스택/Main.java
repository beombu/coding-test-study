package beombu._2주차.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if(command.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                push(x);
            } else if (command.equals("pop")) {
                System.out.println(pop());
            } else if (command.equals("size")) {
                System.out.println(size());
            }else if (command.equals("empty")) {
                System.out.println(empty());
            }else if (command.equals("top")) {
                System.out.println(top());
            }
        }
    }

    private static void push(int x) {
        stack.add(x);
    }

    private static int pop() {
        if(stack.isEmpty()){
            return -1;
        }

        int result = stack.get(size() - 1);
        stack.remove(size() - 1);

        return result;
    }

    private static int size() {
        return stack.size();
    }

    private static int empty() {
        if(stack.isEmpty()){
            return 1;
        }

        return 0;
    }

    private static int top() {
        if(stack.isEmpty()){
            return -1;
        }

        return stack.get(stack.size()-1);
    }
}
