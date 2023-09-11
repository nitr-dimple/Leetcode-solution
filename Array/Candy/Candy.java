class Solution {
    public int candy(int[] ratings) {

        int candies[] = new int[ratings.length];
        candies[0] = 1;
        int total_candies = 0;
        for(int i=1;i< ratings.length; i++){
            if(ratings[i-1] < ratings[i]){
                candies[i] = candies[i-1]+1;
            }else{
                candies[i] = 1;
            }
        }
        total_candies = candies[candies.length-1];
        for(int i=ratings.length-2;i>=0 ; i--){
            if(ratings[i+1] < ratings[i] && candies[i] <= candies[i+1]){
                candies[i] = candies[i+1]+1;
            }
            total_candies+= candies[i];
        }



        // for(int i=1;i< ratings.length; i++){
        //     if(ratings[i] < ratings[i-1] && candies[i-1] == 1){
        //         int j = i;
        //         candies[i]=1;
        //         total_candies++;
        //         while(j>0 && ratings[j-1] > ratings[j] && candies[j-1] <= candies[j]){
        //             candies[j-1]++;
        //             total_candies++;
        //             j--;
        //         }

        //     }
        //     else if(ratings[i] > ratings[i-1] ){
        //         candies[i] = candies[i-1] + 1;
        //         total_candies += candies[i];
        //     }else{
        //         candies[i]=1;
        //         total_candies++;
        //     }
        // } 
        return total_candies;
    }
}