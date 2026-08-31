class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length-1;

        int maxCapacity = 0;

        while(start<end){

            int h = Math.min(height[start],height[end]);
            int w = end-start;

            int currentCapacity = h * w;

            maxCapacity = Math.max(maxCapacity,currentCapacity);

            if(height[start]<height[end]){
                start++;
            }

            else{
                end--;
            }
        }

        return maxCapacity;
    }
}