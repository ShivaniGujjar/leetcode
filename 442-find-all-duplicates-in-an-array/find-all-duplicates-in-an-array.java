class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int x : nums) {
            if (seen.contains(x)) {
                result.add(x);
            } else {
                seen.add(x);
            }
        }
        return result;
    }
}