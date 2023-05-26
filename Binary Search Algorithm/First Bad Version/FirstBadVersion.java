/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        int ans = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(isBadVersion(mid))
            {
                ans = mid;
                high = mid - 1;
            }
            else 
                low = mid + 1;
        }
        return ans;
        // int low = 1;
        // int high = n;
        // while(low <= high) {
        //     int mid = low + (high - low)/2;
        //     if(!isBadVersion(mid-1) && isBadVersion(mid))
        //         return mid;
        //     if(!isBadVersion(mid))
        //         low = mid + 1;
        //     else
        //         high = mid - 1;
        // }
        // return -1;
    }
}