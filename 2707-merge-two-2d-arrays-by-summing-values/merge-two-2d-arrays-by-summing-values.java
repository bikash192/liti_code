class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hs.put(nums1[i][0], nums1[i][1]);
            set.add(nums1[i][0]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hs.containsKey(nums2[i][0])) {
                hs.put(nums2[i][0], hs.get(nums2[i][0]) + nums2[i][1]);
            } else {
                hs.put(nums2[i][0], nums2[i][1]);
            }
            set.add(nums2[i][0]);
        }
        List<Integer> sortedKeys = new ArrayList<>(set);
        Collections.sort(sortedKeys);
        int[][] merge = new int[hs.size()][2];
        int idx = 0;

        for (int key : sortedKeys) {
            merge[idx][0] = key;
            merge[idx][1] = hs.get(key);
            idx++;
        }
        return merge;

    }
}