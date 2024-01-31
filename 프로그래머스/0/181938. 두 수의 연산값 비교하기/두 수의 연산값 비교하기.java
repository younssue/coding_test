class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        if(Integer.valueOf(strA+strB) < 2*a*b){
            answer = 2*a*b;
        }else if(Integer.valueOf(strA+strB) == 2*a*b){
            answer = Integer.valueOf(strA+strB);
        }else{
            answer = Integer.valueOf(strA+strB);
        }
        return answer;
    }
}