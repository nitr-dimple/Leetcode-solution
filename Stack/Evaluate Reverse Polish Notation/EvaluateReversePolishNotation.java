class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int p = stk.pop();
                int q = stk.pop();
                if(s.equals("+")) stk.push(p+q);
                else if(s.equals("-")) stk.push(q-p);
                else if(s.equals("/")) stk.push(q/p);
                else if(s.equals("*")) stk.push(q*p);
            }
            else
                stk.push(Integer.parseInt(s));
        }
        return stk.pop();
        
    }
}