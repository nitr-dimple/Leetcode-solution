# Problem

Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

     |a - x| < |b - x|, or
     |a - x| == |b - x| and a < b
### Example 1:

```
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
```

### Example 2:
```
Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
```

### Constraints:
- 1 <= k <= arr.length
- 1 <= arr.length <= 10<sup> 4 </sup>
- arr is sorted in ascending order.
- -10 <sup> 4 </sup> <= arr[i], x <= 10<sup> 4 </sup>

## Approach
1. If the length of the array is equal to k, return list
2. Search the position of the x using binary search algorithm
3. Check the position of the x with respect to mid and set i and j value
4. Use two pointer approach to find all the elements 


