class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(int i =0; i< str_list.length; i++){
            // ex 를 포함한 문자열은 제외
            if(!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
        return answer;
    }
}