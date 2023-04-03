class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0 ;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*')
                count++;
            else if(count > 0){
                count--;
            }
            else if(count == 0)
                res.append(s.charAt(i));
        }
        return res.reverse().toString();
    }
}