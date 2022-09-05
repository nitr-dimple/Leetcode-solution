# Problem

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

### Example 1:

```
Input: head = [1,2,2,1]
Output: true
```

### Example 2:

```
Input: head = [1,2]
Output: false
```

### Constraints:

- The number of nodes in the list is in the range [1, 10<sup> 5 </sup>].
- 0 <= Node.val <= 9

## Approach:

- Find the middle node of the list
- Reverse the list after the middle node
- traverse reverse list and ordiginal list and check the values of both
