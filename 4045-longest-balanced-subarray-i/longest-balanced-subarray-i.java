class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
       int maxLen = 0;

        for(int i = 0; i < n; i++) {
            HashSet<Integer> seteven = new HashSet<>();
            HashSet<Integer> setodd = new HashSet<>();

            for(int j = i; j < n; j++) {

                if(nums[j] % 2 == 0) {
                    seteven.add(nums[j]);
                }else{
                    setodd.add(nums[j]);
                }

                if(seteven.size() == setodd.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}