class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        

        int [] ans = new int[2];

        while(i<nums.length){

            for(int j=i+1; j<nums.length; j++){

                if(nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }

                
            }

            i++;
        }

        return ans;
        
    }
}