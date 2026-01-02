package beombu._1주차.최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            int value = Integer.parseInt(br.readLine());

            if (maxValue < value) {
                maxValue = value;
                maxIndex = i + 1;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndex);
    }

}
