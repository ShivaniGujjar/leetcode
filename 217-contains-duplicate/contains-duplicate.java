class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>();
        Boolean duplicate = false;
        

        for(int i=0; i<nums.length; i++){

            if(seen.contains(nums[i])){
                duplicate = true;
            }

            else{
                seen.add(nums[i]);
            }

        }

        return duplicate;
    }
}