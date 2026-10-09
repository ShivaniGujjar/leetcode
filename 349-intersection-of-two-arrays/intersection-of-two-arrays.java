class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int x : nums2) {
            if (set1.contains(x)) {
                resultSet.add(x);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int x : resultSet) {
            result[i] = x;
            i++;
        }
        return result;
    }
}