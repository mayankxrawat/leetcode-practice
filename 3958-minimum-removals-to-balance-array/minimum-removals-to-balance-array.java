class Solution {
    public int minRemoval(int[] nums, int k) {
        int n= nums.length;
        Arrays.sort(nums);
           int left = 0;
        int maxKept = 1;   
        for (int right = 0; right < n; right++) {
            while (nums[right] > (long) k * nums[left]) {
                left++;
            }
            maxKept = Math.max(maxKept, right - left + 1);
        }
        return n - maxKept;
    }
}