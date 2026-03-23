class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int max =0;int range=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
           range = range + 1;
        }else{
            range=0;
        }
        max = Math.max(range , max  );
       } 
       return max ;
    }
}