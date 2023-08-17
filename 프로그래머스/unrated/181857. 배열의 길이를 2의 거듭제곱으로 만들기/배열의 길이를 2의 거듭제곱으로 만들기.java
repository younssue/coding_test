class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;

        int pow = 0;
        while (length > Math.pow(2, pow)) {
            pow++;
        }

        int[] answer = new int[(int) Math.pow(2, pow)];
        for (int i = 0; i < length; i++) {
            answer[i] = arr[i];
           
        }
         return answer;
    }
}