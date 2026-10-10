class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int x : nums2) {
            if (map.getOrDefault(x, 0) > 0) {
                resultList.add(x);
                map.put(x, map.get(x) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}