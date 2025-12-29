package seolhee._0주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayProblem05 {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int len = Integer.parseInt(br.readLine());

            int[] numbers = new int[len];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<len; i++){
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            int findNum = Integer.parseInt(br.readLine());

            int count = 0;
            for(int i=0; i<len; i++){
                if(findNum == numbers[i]) count++;
            }

            System.out.println(count);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
