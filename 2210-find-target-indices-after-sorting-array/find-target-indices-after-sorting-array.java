class Solution {
    private int lowerBound(int[] nums , int target){
        int low = 0 ;
        int high = nums.length;
        while( low < high){
            int mid = low + (high - low )/2;
            if(nums[mid]>=target){
                high= mid;
            }else{
                low= mid+1;
            }
        }
        return low;
    }
    private int upperBound(int[] nums , int target){
        int low = 0 ;
        int high = nums.length;
        while( low < high){
            int mid = low + (high - low )/2;
            if(nums[mid]>target){
                high= mid;
            }else{
                low= mid+1;
            }
        }
        return low;
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target);

        List<Integer> ans = new ArrayList<>();

        for(int i = lb;i<ub;i++){
            ans.add(i);
        }
        return ans;
    }
}