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
    public static void main(String[] args) throws IOException {
        //Solution s = new Solution();
        //입력요소
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(st.nextToken()); // 입력된 숫자의 개수
        int quizeNo =Integer.parseInt(st.nextToken()); // 질의 개수

        long[] sumArr = new long[suNo+1];
        st = new StringTokenizer(br.readLine());
        for(int i =1; i<=suNo; i++){
            sumArr[i] = sumArr[i-1]+ Integer.parseInt(st.nextToken());
        }


        for(int i=0; i<quizeNo; i++){

           st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[B] - sumArr[A-1]);
        }






    }
}