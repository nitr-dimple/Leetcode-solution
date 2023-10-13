public class Codec {
    final char DELIMETER = '#';

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String str: strs){
            encoded.append(str.length());
            encoded.append(DELIMETER);
            encoded.append(str);
        }
        return encoded.toString();
        
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder();
            while( s.charAt(i) != DELIMETER){
                sb.append(s.charAt(i++));
            }
            i++;
            int n = Integer.valueOf(sb.toString());
            int end = i + n;
            sb = new StringBuilder();
            while(i< end){
                sb.append(s.charAt(i++));
            }
            i--;
            list.add(sb.toString());
        }
        return list;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));