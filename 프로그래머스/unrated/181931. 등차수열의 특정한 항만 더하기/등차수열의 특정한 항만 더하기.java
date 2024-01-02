class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=0;i<included.length; i++){
//             arr[0] = a;
//             arr[i] = arr[i-1]+b;
            
            if(included[i]){
                answer += a +(i*d);
            }
        }
        return answer;
    }
}