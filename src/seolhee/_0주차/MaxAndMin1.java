package seolhee._0주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxAndMin1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = br.readLine();
            int size = Integer.parseInt(str); //정수 갯수
            str = br.readLine(); // 정수

            int[] arr = new int[size];
            StringTokenizer st = new StringTokenizer(str);

            for(int i = 0; i < size; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            System.out.println(arr[0] + " " + arr[size - 1]);

        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
