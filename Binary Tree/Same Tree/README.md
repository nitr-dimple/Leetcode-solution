# Problem

Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

### Example 1:

```
Input: p = [1,2,3], q = [1,2,3]
Output: true
```

### Example 2:

```
Input: p = [1,2], q = [1,null,2]
Output: false
```

### Example 3:

```
Input: p = [1,2,1], q = [1,1,2]
Output: false
```

## Constraints:

- The number of nodes in the tree is in the range [0, 100].
- -10<sup>4</sup> <= Node.val <= 10<sup>4</sup>

## Algorithm

- Check whether both p and q are not null and p and q are equal.
- if above condition is true, recursively check for left and right child.
- if above condition is false, check whether both p and q are null, if so, return true.
- else return false.
