import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String low = my_string.toLowerCase();
        String[] arr = low.split("");
        Arrays.sort(arr);
        
        answer = String.join("",arr);
        
        
        return answer;
    }
}