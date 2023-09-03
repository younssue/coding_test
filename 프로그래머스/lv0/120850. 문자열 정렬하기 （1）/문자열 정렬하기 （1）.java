import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        String intStr = my_string.replaceAll("[^0-9]", "");
        char[] arr = intStr.toCharArray();
        Arrays.sort(arr);

        // char 배열을 int 배열로 변환
        answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Character.getNumericValue(arr[i]);
        }

        return answer;
    }
}