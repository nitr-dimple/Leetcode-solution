class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;

        for(String s : operations){
            if(s.equals("C")){
                if(!stack.empty()){
                    sum = sum - stack.pop();
                    continue;
                }
            }
            else if(s.equals("D"))
                stack.push(2 * stack.peek());
            else if(s.equals("+")){
                int top = stack.pop();
                int newele = top + stack.peek();
                stack.push(top);
                stack.push(newele);
            }
            else
                stack.push(Integer.parseInt(s));
            sum = sum + stack.peek();
        }
        return sum;

    }
}