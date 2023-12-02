import java.util.Arrays;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] strArr = myString.split("");
        String[] changedArr = new String[myString.length()];
        
        for (int i = 0; i < myString.length(); i++) {
            if (strArr[i].equals("A")) {
                changedArr[i] = "B";
            } else {
                changedArr[i] = "A";
            }
        }
        
        String changedStr = String.join("", changedArr); // 수정된 부분
        if (changedStr.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}
