class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        int i=0;
        for(; i< height.length && height[i] == 0; i++);
        for(; i<height.length;i++){
            if(stack.empty() || height[stack.peek()] >= height[i]){
                stack.push(i);
            }
            else{
                    int val = height[stack.pop()];
                    while(!stack.empty() && val == height[stack.peek()]) 
                        stack.pop(); 
                    while(!stack.empty() && height[stack.peek()] < height[i]){
                        int v1 = i;
                        int v2 = stack.peek();
                        sum += (v1-v2-1) * (height[v2] - val);
                        val = height[stack.pop()];
                    }
                    if(!stack.empty()) sum += (i - stack.peek()-1) * (height[i] - val);
                    stack.push(i);
                }

            }
        return sum;
    }
}