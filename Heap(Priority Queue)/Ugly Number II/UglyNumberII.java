class Solution {
    public int nthUglyNumber(int n) {
        if(n<= 0) return 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int two = 0, three = 0, five = 0;
        ans.add(1);
        while(ans.size() < n){
            int ans2 = ans.get(two) * 2;
            int ans3 = ans.get(three) * 3;
            int ans5 = ans.get(five) * 5;
            int min = Math.min(ans2, Math.min(ans3, ans5));
            if(min == ans2) two++;
            if(min == ans3) three++;
            if(min == ans5) five++;
            ans.add(min);
        }
        return ans.get(ans.size() - 1);
    }
}