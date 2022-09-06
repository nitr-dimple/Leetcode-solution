# Problem

Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

### Example 1:

```
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
```

### Example 2:

```
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
```

### Example 3:

```
Input: s = ""
Output: 0
```

### Constraints:

- 0 <= s.length <= 3 \* 10 <sup> 4 </sup>
- s[i] is '(', or ')'

## Approach

- start from left to right
- count number of open and closed parentheses
- if open == close update the max count accordingly
- if close > open reset open and close count
- Do the same by traversing from right to left
- return max
