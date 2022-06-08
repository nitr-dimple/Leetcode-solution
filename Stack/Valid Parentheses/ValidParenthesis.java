class Solution{
public boolean isValid(String s) {
    Stack<Character> st = new Stack<Character>();
    for(char c : s.toCharArray())
    {
        char cur = '\0';
        if(!st.empty()) cur = st.peek(); 
        if(c == ')' && cur == '(' ) st.pop();
        else if(c == ']' && cur == '[' ) st.pop();
        else if(c == '}' && cur == '{' ) st.pop();
        else st.push(c);
    }
    
    if(st.empty()) return true;
    else return false;
    
    }
}