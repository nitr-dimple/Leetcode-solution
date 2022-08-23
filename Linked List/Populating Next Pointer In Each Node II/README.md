# Problem

Given a binary tree

```
struct Node {
int val;
Node *left;
Node *right;
Node \*next;
}
```

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

### Example 1:

```
Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
```

### Example 2:

```
Input: root = []
Output: []
```

## Constraints:

- The number of nodes in the tree is in the range [0, 6000].
- -100 <= Node.val <= 100

## Solution

- Use DFS traversal method and maintain the node which is being processed(left node or right node). id = 1 indicates the left node and id = 2 indicates the right node.
- if the node begin processor is right node, then check the next pointer of the parent.
  - if the next pointer of the parent is null, then return
  - else find the available left/right pointer of the next pointer of parent
- if the node begin processor is left node, then check the right pointer of the parent.
  - if right pointer is available, then right pointer will be the next pointer of the root.left
  - if not available, then check next pointer of the parent and search the available node.
- return root.
