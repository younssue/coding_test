class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
         String myStringLower = myString.toLowerCase();
         String patLower = pat.toLowerCase();
        
        if(myStringLower.contains(patLower)){
            answer=1;
        }
        return answer;
    }
}