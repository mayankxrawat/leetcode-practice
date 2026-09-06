class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxones =0;
        int count = 0 ;
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            maxones = Math.max(maxones,count);
            if(nums[i]==0){
                count =0;
            }
        }
        return maxones;
    }
}