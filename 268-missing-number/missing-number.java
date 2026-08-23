class Solution {
    public int missingNumber(int[] nums) {


        int actualSum = 0;
        int numsSum = 0;
        int n = nums.length;

        for(int i = 0; i<=n; i++){

            actualSum += i;
        }

        for(int j =0; j<nums.length; j++){
            numsSum += nums[j];
        }

        int missingNum = actualSum - numsSum;

        return missingNum;
    }
}