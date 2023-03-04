class Solution {
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<Integer>();
        int result = 0;
        int sign = 1;
        int num = 0;
        stk.push(sign);

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <='9'){
                num = num * 10 + (s.charAt(i) - '0');
            }else if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                result += sign * num;
                sign = stk.peek() * (s.charAt(i) == '+' ? 1 : -1);
                num = 0;
            }
            else if(s.charAt(i) == '('){
                stk.push(sign);
            }else if(s.charAt(i) == ')')
                stk.pop();
        }      
        result += sign * num;
        return result;
    }
}