class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int area = 0, max_area = 0;
        int top,i;
        for(i=0; i< heights.length;){
            if(stk.empty() || heights[i] >= heights[stk.peek()]) 
                stk.push(i++);
            else {
                top = stk.peek();
                stk.pop();
                if(stk.empty())
                    area = heights[top] * i;
                else
                    area = heights[top] * (i-1- stk.peek());
                if(area > max_area) max_area= area;
            }
        }
        while(!stk.empty()){
            top = stk.peek();
            stk.pop();
            if(stk.empty())
                area = heights[top] * i;
            else
                area = heights[top] * (i-1- stk.peek());
            if(area > max_area) max_area= area;
        }
        return max_area;
        
    }
}