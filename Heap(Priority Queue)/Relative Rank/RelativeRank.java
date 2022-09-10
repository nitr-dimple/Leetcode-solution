class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        int max = 0;

        for(int num : score) 
            if(num > max)
                max = num;
      

        String[] map = new String[max + 1];
        for(int i = 0; i < len; i++) 
            map[score[i]] = "X";

        int index = 0;
        String[] s = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};

        for(int i = max; i >= 0; i--) {
            if(map[i] != null) {
                if(index < 3) 
                    map[i] = s[index];
                else 
                    map[i] = Integer.toString(index + 1);
                index++;
            }
        }

        String[] res = new String[len];
        for(int i = 0; i < len; i++) 
            res[i] = map[score[i]];
        return res;
        
        
    }
}