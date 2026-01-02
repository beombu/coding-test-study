package beombu._1주차.개수_세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            if(v == Integer.parseInt(st.nextToken())) {
                count++;
            }
        }

        System.out.println(count);
    }

}
