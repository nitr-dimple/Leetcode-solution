class Solution {
    public int firstUniqChar(String s) {
        int answer = s.length();
        for(char c = 'a';c <= 'z';c++){
            int res = s.indexOf(c);
            if(res!=-1 && res==s.lastIndexOf(c))
                answer = Math.min(answer, res);
        }
        return answer==s.length() ? -1:answer;
    }
}