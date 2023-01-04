class Solution {
    public String reverseWords(String s1) {
        if(s1.length() == 0) return "";
        StringBuilder s = new StringBuilder();
        StringBuilder res = new StringBuilder();
        int i = s1.length() - 1;
        while(s1.charAt(i) == ' ') i--;
        while( i>= 0){
            if(s1.charAt(i) != ' '){
                s.insert(0, s1.charAt(i));
                i--;
            }else{
                while(i>=0 && s1.charAt(i) == ' ') i--;
                res.append(s);
                if(i>=0)
                    res.append(" ");
                s.setLength(0);
            }
        }
        if(s.length() != 0) res.append(s);
        return res.toString();
    }
}