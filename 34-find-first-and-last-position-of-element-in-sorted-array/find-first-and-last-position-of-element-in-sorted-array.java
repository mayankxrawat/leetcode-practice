class Solution {
    public int firstpos(int[] nums , int n ){
        int first = -1;
        int low = 0 ;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]== n){
                first = mid ;
                high = mid - 1;
            }else if(nums[mid] < n){ 
                low = mid + 1;
            }else{
                 high = mid - 1;
                }
        }
        return first;

    }


    public int lastpos(int[] nums , int n ){
        int last = -1;
        int low =0 ;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == n){
                last = mid ;
                low = mid + 1;
            }else if(nums[mid] < n){
            low = mid + 1;
            }
            else{
            high = mid - 1;
            }
        }
        return last;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstpos(nums , target);
        int last = lastpos(nums , target );
        int ans[] = new int[2];
        ans[0]= first;
        ans[1]= last;
        return ans;
    }
}