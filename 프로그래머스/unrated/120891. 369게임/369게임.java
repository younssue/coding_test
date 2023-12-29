class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = Integer.toString(order);
        String[] arr = orderStr.split("");
        
        for(int i=0;i<arr.length; i++){
            if(arr[i].contains("3")){
                answer++;
            }
            
            if(arr[i].contains("6")){
                answer++;
            }
            
            if(arr[i].contains("9")){
                answer++;
            }
        }
        return answer;
    }
}