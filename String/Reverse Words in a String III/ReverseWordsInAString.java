class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        if(words.length == 0) return "";
        String st = words[0];
        StringBuilder str = new StringBuilder(st),s1;
        str = str.reverse();
        for(int i=1; i< words.length; i++){
            str.append(" ");
            s1 = new StringBuilder(words[i]);
            str.append(s1.reverse());
        }
        return str.toString();        
        
    }
}