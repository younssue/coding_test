import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        // 오름차순으로 정렬
        Arrays.sort(num_list);
        
        // 앞에서 부터 6번째 이후의 수
        for(int i = 5; i<num_list.length; i++){
            answer[i-5] = num_list[i];
        }
    
        return answer;
    }
}