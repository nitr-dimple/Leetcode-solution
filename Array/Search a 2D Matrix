class Solution {
    public int rowNumber(int[][] matrix, int target){
        int low = 0;
        int high = matrix.length-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(matrix[mid][0] == target) return mid;
            if(target > matrix[mid][0]) low = mid +1;
            else high = mid -1;
        }
        return low-1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = rowNumber(matrix, target);
        if(row < 0) return false; 
        if(matrix[row][0] == target) return true;
        int low = 0;
        int high = matrix[row].length -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(matrix[row][mid] == target) return true;
            if(target > matrix[row][mid]) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}