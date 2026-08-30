class Solution {
    public int dominantIndex(int[] nums) {
        int max = Math.max(nums[0],nums[1]);
        int secondMax = Math.min(nums[0],nums[1]);

        int maxIndex = (nums[0] > nums[1]) ? 0 : 1;

        for(int i=2; i<nums.length; i++){

            if(nums[i]>max){
                
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            }

            else if(nums[i]>secondMax){
                secondMax = nums[i];
            }
        }

        if(max>=secondMax+secondMax){
            return maxIndex;
        }

        else{
            return -1;
        }
    }
}