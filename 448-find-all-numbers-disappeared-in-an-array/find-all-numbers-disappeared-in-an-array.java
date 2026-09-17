class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> present = new HashSet<>();
        
        
        for (int i = 0; i < nums.length; i++) {
            present.add(nums[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        
        
        for (int i = 1; i <= nums.length; i++) {
            if (!present.contains(i)) {
                result.add(i);
            }
        }
        
        return result;
        
    }
}