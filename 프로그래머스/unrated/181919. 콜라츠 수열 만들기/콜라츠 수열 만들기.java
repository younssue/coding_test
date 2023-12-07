import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> seq = new ArrayList<>();
        seq.add(n);
        
        while(n != 1){
            if(n %2 == 0){
                n /= 2;
            }else{
                n = 3 * n + 1;
            }
            seq.add(n);
        }
        
        int[] answer = new int[seq.size()];
        for(int i=0; i< seq.size(); i++){
            answer[i] = seq.get(i);
        }
        return answer;
    }
}