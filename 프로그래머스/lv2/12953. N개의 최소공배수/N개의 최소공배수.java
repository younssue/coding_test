class Solution {
    public int solution(int[] arr) {
        int answer = arr[0]; 
        //answer값을 arr[0]으로고정
        
        for(int i=1; i<arr.length; i++){
            answer = lcm(answer,arr[i]);
        }
        return answer;
        
        
        
        
    }
    
    //최대공약수
    private static int gcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
    
    //최대공약수 
    private static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
    
    
    
}