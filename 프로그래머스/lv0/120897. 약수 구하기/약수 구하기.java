class Solution {
    public int[] solution(int n) {
        int cnt=0;
        
        for(int i=1; i<=n; i++){
            if(n%i ==0){
                cnt++;
            }
        }
        int j=0;
        int[] answer = new int[cnt];
        for(int i =1; i<=n; i++){
            if(n%i==0){
                answer[j] = i;
               j++;
            }
        }
         
        return answer;
    }
}