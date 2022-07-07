# Problem

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

### Example 1:

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
```

### Example 2:

```
Input: height = [4,2,0,3,2,5]
Output: 9
```

## Constraints:

- n == height.length
- 1 <= n <= 2 \* 10<sup>4</sup>
- 0 <= height[i] <= 10<sup>5</sup>

### Approach 1:

Using Stack:

#### Algorithm :

- Iterate over the array while the height of the bar is 0.
- Iterate over the the rest of the array and do the following -
  - if stack is empty or current height of the bar is less than or equal to the height of the top br of stack then push the bar index into the stack.
  - else store the stack top bar height into val
  - pop the top element from the stack until their height is same.
  - repeat the following till either stack is empty or current height of the bar is greater than the height of the top bar of the stack
    - calculate the distance as i-stack.peek()-1.
    - sum = sum + distance \* (height[stack.peek()] - val)
    - val = height[stack.pop()]
  - if stack is empty then sum = sum + (i- stack.peek()-1) \* (height[i] - val)
  - push i to the stack.
- return sum.
