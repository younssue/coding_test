class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum =0;
        
        String str = Integer.toString(x);
        String[] arr = str.split("");
        
        for(int i=0; i<arr.length; i++){
            sum +=Integer.parseInt(arr[i]);
        }
        if( x % sum !=0){
            answer =false;
        }
        return answer;
    }
}