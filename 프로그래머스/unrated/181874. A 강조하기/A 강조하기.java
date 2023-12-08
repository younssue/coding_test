class Solution {
    public String solution(String myString) {
        String answer = "";
        String lowerStr =myString.toLowerCase();
        String[] str = lowerStr.split("");
        
        for(int i =0; i<str.length; i++){
            if(str[i].equals("a")){
                str[i]="A";
            }
        }
        answer = String.join("", str);
        System.out.println(answer);
        return answer;
    }
}