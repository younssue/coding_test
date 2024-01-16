import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int i=0;
        int j=people.length-1;
        Arrays.sort(people);
        
        //[50,50,70,80]
        while(i<=j){
            if(people[i]+people[j] <= limit){
                
                i++;
                
            }
            
                j--;
                answer++;
            
            
        }
        
        return answer;
    }
}