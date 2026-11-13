class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high = 0 ; 
        for(int w: weights){
            low= Math.max(w,low);
            high +=w;
        }
        while(low<high){
            int mid = low+(high-low)/2;
            if(canShip (weights , mid , days)){
                high=mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean canShip(int[] weights , int capacity , int days){
        int dayUsed = 1;
        int currLoad = 0;
        for(int w:weights){
              if( currLoad + w > capacity){
                dayUsed++;
                currLoad = 0 ;
                }
                if(dayUsed>days){
                    return false;
                }else{
                    currLoad += w;
                }
            }
      return true;
    }
}