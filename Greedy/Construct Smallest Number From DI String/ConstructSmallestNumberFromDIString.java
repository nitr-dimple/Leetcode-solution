class Solution {
    public String smallestNumber(String pattern) {
        String res = "";
        int ind = pattern.length() + 1, countD = 0;
        for(int i = pattern.length() - 1;i >= 0; i--){
            if(pattern.charAt(i) == 'D') countD++;
            else{
                String s = String.valueOf(ind);
                while(countD > 0){
                    ind--;
                    s += String.valueOf(ind);
                    countD--;
                }
                ind--;
                res = s + res;
            }
        }
        String s = String.valueOf(ind);
        while(countD > 0){
            ind--;
            s += String.valueOf(ind);
            countD--;
        }
        res = s + res;
        return res;
    }
}