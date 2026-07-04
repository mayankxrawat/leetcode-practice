class Solution {
    private int minimum(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
        private int maximum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    private boolean possible(int arr[], int day , int m , int k){
        int count = 0 ; 
        int noOfB = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<=day){
                count++;
            }else{
                noOfB += (count/k);
                count = 0;
            }
              
        }
         noOfB += (count/k); 
         return noOfB >= m;
    }
    public int minDays(int[] bloomday, int m, int k) {
        int low = minimum (bloomday) ;
        int high = maximum (bloomday);
        int ans =-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(possible(bloomday , mid , m , k)== true ){
               ans = mid ;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans ;
    }
}