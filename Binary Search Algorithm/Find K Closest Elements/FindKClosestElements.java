class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        if(arr.length == k){
            for(int i=0; i< arr.length; i++)
                list.add(arr[i]);
        }
        
        int low = 0;
        int high = arr.length -1;
        int mid = 0;
        while(low <= high){
            mid = low + (high -low)/2;
            if(arr[mid] == x){
                break;
            }
            if(x < arr[mid]) high = mid -1;
            else low = mid + 1;
        }
        
        int p = mid-1;
        while(p>= 0 && arr[p] == arr[mid] && arr[mid] == x)
            mid = p--;
        
        int i, j;
        if(x <= arr[mid]){
            i = mid-1;
            j = mid;
        }
        else{
            i = mid;
            j = mid + 1;
        }
        
        while(list.size() < k){
            if(i<0) list.addLast(arr[j++]);
            else if(j>= arr.length) list.addFirst(arr[i--]);
            else if(Math.abs(arr[i]- x) <= Math.abs(arr[j]-x))
                list.addFirst(arr[i--]);
            else
                list.addLast(arr[j++]);
        }
        
        return list;
    }
}