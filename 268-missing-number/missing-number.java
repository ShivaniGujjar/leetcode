class Solution {
    public int missingNumber(int[] nums) {

       int n = nums.length;
       int expectedSum = 0;
       int actualSum = 0;

       for(int i=0; i<n; i++){
        expectedSum += i+1;

        actualSum += nums[i];
       }

       return expectedSum - actualSum;
        
    }
}