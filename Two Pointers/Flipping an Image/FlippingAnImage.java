class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0; i< image.length; i++){
            for(int j=0; j<image[0].length/2; j++){
                int temp = image[i][j];
                if(image[i][image[0].length-1-j] == 0) image[i][j] = 1;
                else image[i][j] = 0;

                if(temp == 0) image[i][image[0].length-1-j] = 1;
                else image[i][image[0].length-1-j] = 0;
            }
            if(image[0].length % 2 != 0)
            {
                if(image[i][image[0].length/2] == 0 ) image[i][image[0].length/2] = 1;
                else image[i][image[0].length/2] = 0;
            }
        }
        return image;
    }
}