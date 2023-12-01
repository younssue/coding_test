class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] strArr = num_str.split("");
        for(int i =0; i<num_str.length(); i++){
            answer += Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}