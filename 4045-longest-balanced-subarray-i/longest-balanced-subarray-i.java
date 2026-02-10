class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
       int maxlen = 0;

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
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }
}