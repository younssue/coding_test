class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] string = my_string.split("");
        
        for (int i = 0; i < string.length; i++) {
            answer += Integer.parseInt(string[i]);
        }
        
        return answer;
    }
}
