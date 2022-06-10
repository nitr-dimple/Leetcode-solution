# Problem

Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.

### Example 1:

```
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

### Example 2:

```
Input: preorder = [-1], inorder = [-1]
Output: [-1]
```

## Constraints:

- 1 <= preorder.length <= 3000
- inorder.length == preorder.length
- -3000 <= preorder[i], inorder[i] <= 3000
- preorder and inorder consist of unique values.
- Each value of inorder also appears in preorder.
- preorder is guaranteed to be the preorder traversal of the tree.
- inorder is guaranteed to be the inorder traversal of the tree.

## Algorithm

### Approach 1:

- Pick an element from Preorder array. Increament the preindex to pick the next element in the next recursive call.
- Create tree node as tnode with the data as the picked element.
- Find the index of picked element in the inorder array and name it as inindex.
- call the createTree for all the elements before inindex elements and make it as a left child of tnode.
- call the createTree for all the elements after inindex elements and make it as a right child of tnode.
- return tnode.

Time complexity: O(n<sup>2</sup>)

### Approach 2:

Use map to search an index in inorder array.
