class Solution {
    public String solution(String my_string, int s, int e) {
        String subStr = my_string.substring(s,e+1);
        System.out.println(subStr);
        
        StringBuffer sb = new StringBuffer(subStr);
        String reverStr = sb.reverse().toString();
        System.out.println(reverStr);
        
        my_string = my_string.replaceAll(subStr, reverStr);
        System.out.println(my_string);
        return my_string;
    }
}