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
- 1 <= n <= 2 \* 10<sup>4 </sup>
- 0 <= height[i] <= 10<sup> 5 </sup>

## Approach

- Use two pointer approach
- maintain two variable for left max and right max
- initialize 2 variable low and high and sum = 0
- if height[low] < height[high]
  - if left_max < height[low]
    - left_max = height[low]
  - else sum = sum + left_max - height[low]
  - low++
- else
  - if right_max < height[high]
    - right_max = height[high]
  - else sum = sum + right_max - height[high]
  - high--
- return sum
