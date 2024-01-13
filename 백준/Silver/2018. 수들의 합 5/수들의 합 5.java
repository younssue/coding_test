// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution{

}

public class Main {
    public static void main(String[] args) {
        //Solution s = new Solution();
        //입력요소
         Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = sc.nextInt();
        int count =1;
        int start_index =1;
        int end_index =1;
        int sum =1;

        sc.close();
        while (end_index != N){
            if(sum == N){
                count++;
                end_index++;
                sum += end_index;
            }else if (sum>N){
                
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}