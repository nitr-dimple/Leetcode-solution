class Solution {
    public String predictPartyVictory(String senate) {
        int count = 0;
        boolean r = true,  d = true;
        char arr[] = senate.toCharArray();
        while(r && d){
            r = false;
            d = false;
            for(int i = 0; i< arr.length; i++){
                if(arr[i] == 'R'){
                    if(count < 0)
                        arr[i] = 'X';
                    else
                        r = true;
                    count++;
                }
                else if(arr[i] == 'D'){
                    if(count > 0)
                        arr[i] = 'X';
                    else
                        d = true;
                    count--;
                }
            }
        }
        return r ? "Radiant" : "Dire";
    }
}