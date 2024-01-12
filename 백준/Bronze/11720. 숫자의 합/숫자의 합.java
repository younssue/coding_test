import java.util.Scanner;

class Solution{

}

public class Main {
    public static void main(String[] args) {
       //Solution s = new Solution();
       //입력요소
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 입력된 숫자의 개수
        String sNum = sc.next();

        sc.close();
        int answer =0;
        String[] str = sNum.split("");
        for(int i=0; i<A; i++){
             answer += Integer.parseInt(str[i]);
        }

        System.out.println(answer);



    }
}