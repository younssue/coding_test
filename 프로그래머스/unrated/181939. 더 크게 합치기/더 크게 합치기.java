class Solution {
    public int solution(int a, int b) {
        
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        int ab_num = Integer.parseInt(ab);
        int ba_num = Integer.parseInt(ba);
        
        if(ab_num>ba_num){
            return ab_num;
        }else{
            return ba_num;
        }
       
    }
}