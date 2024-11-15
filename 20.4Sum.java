class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();

        for (int a = 0; a < nums.length - 3; a++) {
            for (int i = a + 1; i < nums.length - 2; i++) {
                int j = i + 1;
                int k = nums.length - 1;

                while (j < k) {
                    long sum = (long) nums[a] + nums[i] + nums[j] + nums[k];

                    if (sum == target) {
                  ans.add(Arrays.asList(nums[a], nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    } else if (sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
