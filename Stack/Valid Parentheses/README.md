# Problem

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.

### Example 1:

```
Input: s = "()"
Output: true
```

### Example 2:

```
Input: s = "()[]{}"
Output: true
```

### Example 3:

```
Input: s = "(]"
Output: false
```

## Constraints:

- 1 <= s.length <= 10<sup>4</sup>
- s consists of parentheses only '()[]{}'.

## Algorithm
- Create a stack
- For each character in string
  - peek top of stack (if stack not empty)
  - if top element is open bracket and current character is corresponding closing bracket (e.g. peek = {, current = }) then pop
  - else push current char
- if stack empty return true, else return false
