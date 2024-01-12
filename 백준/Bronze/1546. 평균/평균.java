// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

class Solution{

}

public class Main {
    public static void main(String[] args) {
       //Solution s = new Solution();
       //입력요소
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 입력된 숫자의 개수
        int[] arr = new int[A];
        for(int i =0; i<A; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        long max=0;
        long sum=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
            sum += arr[i];
        }


        System.out.println(sum *100.0 /max / A);



    }
}