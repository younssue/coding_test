
import java.util.Scanner;

class Solution{

}

public class Main {
    public static void main(String[] args) {
       //Solution s = new Solution();
       //입력요소
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();


        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);



    }
}