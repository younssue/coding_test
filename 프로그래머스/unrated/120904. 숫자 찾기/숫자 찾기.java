class Solution {
    public int solution(int num, int k) {
        //int answer = 0;
        String str = Integer.toString(num);
        String[] arr = str.split("");
        
        for(int i=0; i<arr.length; i++){
            
            if(Integer.parseInt(arr[i]) == k){
                return  i+1; 
            }
        }
        return -1;
    }
}