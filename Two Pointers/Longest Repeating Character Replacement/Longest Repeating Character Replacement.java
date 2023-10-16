class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0; 
        int right = 0;
        int max_length = 0;
        int most_frequent = 0;
        int charArray[] = new int[26];

        for(; right < s.length(); right++){
            most_frequent = Math.max(most_frequent, ++charArray[s.charAt(right) - 'A']);
            while(right - left + 1 - most_frequent > k){
                charArray[s.charAt(left++) - 'A']--;
            }
            max_length = Math.max(max_length, right - left + 1);
        }
        return max_length;
    }
}