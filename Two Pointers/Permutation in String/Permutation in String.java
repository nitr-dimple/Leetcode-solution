class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int a[] = new int[26];
        int b[] = new int[26];

        int i=0;
        for(; i< s1.length(); i++){
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }
        int j=0;

        for(; i< s2.length(); i++){
            if(Arrays.equals(a, b)) return true;
            b[s2.charAt(j++) - 'a']--;
            b[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(a, b)) return true;
        return false;
        
    }
}