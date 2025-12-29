package seolhee._0주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayProblem03 {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int[] numbers = new int[9];
            for(int i=0; i<9; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }

            int maxValue = numbers[0];
            int maxNum = 1;
            for(int i=1; i<9; i++){
                if(numbers[i] > maxValue){
                    maxValue = numbers[i];
                    maxNum = i+1;
                }
            }

            System.out.println(maxValue);
            System.out.println(maxNum);
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
