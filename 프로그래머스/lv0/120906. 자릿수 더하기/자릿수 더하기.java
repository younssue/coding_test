class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum=0;
        while(n > 0) {
            
           sum += n%10;
           int mok = n/10;
           n = mok;
        }
        answer =sum;
        return answer;
    }
}