class Solution {
    public double solution(String binomial) {
        double answer = 0;
        String[] arr = null;

        if (binomial.contains("+")) {
            arr = binomial.split("\\+");
        } else if (binomial.contains("-")) {
            arr = binomial.split("-");
        } else if (binomial.contains("*")) {
            arr = binomial.split("\\*");
        }

        if (arr != null && arr.length == 2) { 
            double operand1 = Double.parseDouble(arr[0]);
            double operand2 = Double.parseDouble(arr[1]);

            if (binomial.contains("+")) {
                answer = operand1 + operand2;
            } else if (binomial.contains("-")) {
                answer = operand1 - operand2;
            } else if (binomial.contains("*")) {
                answer = operand1 * operand2;
            }
        }

        return answer;
    }
}
