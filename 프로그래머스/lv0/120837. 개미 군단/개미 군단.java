class Solution {
    public int solution(int hp) {
        int answer = 0;
        //5로 나누고 3으로 나누고 1로나누고
        //1. hp 5로 나눈 몫 / 나머지는 3으로 나눈다
     
       
           answer = hp/5 + hp%5/3 + ((hp%5)%3)/1;
        
        
     
        
        
        return answer;
    }
}