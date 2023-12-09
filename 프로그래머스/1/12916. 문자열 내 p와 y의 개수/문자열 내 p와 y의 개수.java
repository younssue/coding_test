class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pcnt=0;
        int ycnt=0;
        
        String str =s.toLowerCase();
        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("p")){
                pcnt++;
            }
            
            if(arr[i].equals("y")){
                ycnt++;
            }
            
            
        }
        
            if(pcnt == ycnt ){
                answer =true;
            }else{
                answer = false;
            }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}