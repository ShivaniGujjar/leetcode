class Solution {
    public int maxProduct(int[] nums) {

        int max = Math.max(nums[0],nums[1]);
        int smax = Math.min(nums[0],nums[1]);
        
        for(int i=2; i<nums.length; i++){

            if(nums[i]>max){
               int temp = max;
               max = nums[i];
               smax = temp;

            }

            else if(nums[i]>smax){
                smax = nums[i];
            }

            
        }

        
        int ans = (max-1)*(smax-1);

        return ans;
        
    }
}