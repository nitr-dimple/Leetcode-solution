# Problem

Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

### Example 1:

```
Input: head = [1,2,3,4,5], left = 2, right = 4

Output: [1,4,3,2,5]
```

### Example 2:

```
Input: head = [5], left = 1, right = 1
Output: [5]
```

### Constraints:

- The number of nodes in the list is n.
- 1 <= n <= 500
- -500 <= Node.val <= 500
- 1 <= left <= right <= n

## Solution:

### Algorithm:

1. Traverse the list till we get the left node and save previous nodes in prev.
2. Save the currnet temp node in p. The current temp node will be the last node in the reversed list so start adding the next node at the begining of the list p till we reach node at right position.
3. Now change the pointer of first and last node of reversed list to merge in the original list.
