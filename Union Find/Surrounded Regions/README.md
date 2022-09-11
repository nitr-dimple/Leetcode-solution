# Problem

Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

### Example 1:

```
Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
Explanation: Notice that an 'O' should not be flipped if:
- It is on the border, or
- It is adjacent to an 'O' that should not be flipped.
The bottom 'O' is on the border, so it is not flipped.
The other three 'O' form a surrounded region, so they are flipped.
```

### Example 2:
```
Input: board = [["X"]]
Output: [["X"]]
```

### Constraints:

- m == board.length
- n == board[i].length
- 1 <= m, n <= 200
- board[i][j] is 'X' or 'O'

### Approach

- It is sure that the 'O's at the boundaries will never flipped
- Also 'O' connected to the boundaries will also not flipped
- Find 'O' at the boundaries and its connected 'O' using dfs and marked them as 'Y'
- Now in the matrix, all the unsurrounded 'O' are changed to 'Y' and surrounded 'O' remains as it is.
- Flip all the 'O' with 'X' and all the 'Y' with 'O'
