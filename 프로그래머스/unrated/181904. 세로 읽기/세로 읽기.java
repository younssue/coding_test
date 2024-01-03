import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> str = new ArrayList<>();
        
        for(int i =0; i<my_string.length(); i+=m){
           String a = my_string.substring(i,i+m);
            str.add(a);
            
        }
       // System.out.print(str);
        
        String answer = "";
        for(String b : str){
            answer += b.substring(c-1,c);
            
        }
        
        //System.out.print(answer);
      
        
        return answer;
    }
}