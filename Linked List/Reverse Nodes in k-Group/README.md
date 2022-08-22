# Problem

Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

### Example 1:

```
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
```

### Example 2:

```
Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
```

## Constraints:

- The number of nodes in the list is n.
- 1 <= k <= n <= 5000
- 0 <= Node.val <= 1000

## Solution

- Calculate the length of the list
- Create a dummu node pointing to head of the list.
- Initialize the temp to dummy node.
- Repeat until count is less than or equal to length of the list/ k.

  - intialize p = temp.next
  - for each group of k nodes, reverse the linked list and maintain the start node and return the end node.
  - reasign temp to start node
  - increment count

- return next pointer of dummy node.
