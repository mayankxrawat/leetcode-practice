class Solution {
    public int maxProduct(int[] nums) {
     int largest = -1;
     int secLargest =-1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]>= largest){
             secLargest= largest;
            largest = nums[i];
        }else if(nums[i]>= secLargest && nums[i]< largest){
            secLargest = nums[i];
        }
     }
     return((largest-1)*(secLargest-1));
    }
}