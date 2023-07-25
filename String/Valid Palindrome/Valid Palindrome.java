class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int j = s.length() -1, i=0;
        while(i < j) {

            if(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') && !(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                i++;
                continue;
            }  
            if(!(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') && !(s.charAt(j) >= '0' && s.charAt(j) <= '9')){
                j--;
                continue;
            }
   
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}