class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashNums = new HashMap<>();
        for (int n = 0; n < nums.length; n++) {
            if (hashNums.containsKey(target - nums[n])) {
                return new int[]{hashNums.get(target - nums[n]), n};
            }
            hashNums.put(nums[n], n);
        }
        return nums;
    }
}