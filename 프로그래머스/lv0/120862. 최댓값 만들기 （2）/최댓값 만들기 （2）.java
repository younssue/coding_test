import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        //가장 작은 값 두개 곱(각각 음수일 수도 있으니까)
        int min =numbers[0]*numbers[1];
        int max = numbers[numbers.length-1]* numbers[numbers.length-2];
        
        if(min > max){
            answer =min;
        }else{
            answer =max;
        }
        
        return answer;
    }
}