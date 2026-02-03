class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;
        int i = 1;
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }
        int p = i - 1;
        if (p == 0 || i == n) return false; 
        while (i < n && nums[i] < nums[i - 1]) {
            i++;
        }
        int q = i - 1;
        if (q == p || i == n) return false;
        while (i < n) {
            if (nums[i] <= nums[i - 1]) return false;
            i++;
        }
        return true;
    }
}