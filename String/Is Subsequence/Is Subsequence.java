class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0) return true;
        int spointer = 0;
        for(int i =0; i< t.length(); i++){
            if(s.charAt(spointer) == t.charAt(i)) spointer++;
            if(spointer == s.length()) return true;
        }
        return false;
        
    }
}