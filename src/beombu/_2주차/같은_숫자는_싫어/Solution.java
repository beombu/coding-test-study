package beombu._2주차.같은_숫자는_싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> queue = new ArrayList<>();

        int beforeNumber = -1;

        for(int i=0;i<arr.length;i++){
            if (arr[i] == beforeNumber) {
                continue;
            }

            queue.add(arr[i]);
            beforeNumber = arr[i];
        }

        return queue.stream().mapToInt(x->x).toArray();
    }
}