// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution{

}

public class Main {
    public static void main(String[] args) throws IOException {
        //Solution s = new Solution();
        //입력요소
         //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //int N = sc.nextInt();
        //sc.close();


        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int[] arr = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count =0;
        int i=0;
        int j=A-1;

        while (i<j){
            if(arr[i]+arr[j] < B){
                i++;
            }else if(arr[i]+arr[j] > B) {
                j--;
            }else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        br.close();
    }
}