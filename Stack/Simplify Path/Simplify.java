class Solution {
    public String simplifyPath(String path) {
        String respath = "";
        Stack<String> stk = new Stack<>();
        String split[] = path.split("/");
        
        for(String s : split){
            if(s.equals("..") ) {
                if(!stk.isEmpty())
                    stk.pop();
            }
            else if(s.equals(".")) continue;
            else if(!s.equals("")) stk.push(s);
        }
        if(stk.isEmpty()) respath = "/";
        while(!stk.isEmpty()){
            respath = "/" + stk.peek() + respath;
            stk.pop();
        }
        return respath;
        
    }
}