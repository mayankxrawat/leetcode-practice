class Solution {
    void reverse(int arr[] , int st , int end){
        while(st<=end){
            int temp = arr[st];
            arr[st]= arr[end];
            arr[end] = temp ;
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k % n ;
       reverse(nums , 0 , n-k-1) ;
       reverse(nums , n-k , n-1);
       reverse(nums , 0 , n-1);
    }
}