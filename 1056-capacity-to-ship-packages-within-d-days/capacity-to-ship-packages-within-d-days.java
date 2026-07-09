class Solution {
    int capacity( int arr[] , int cap){
        int days =1;
        int load =0;

        
        for (int weight : arr) {
            if (load + weight <= cap) {
                load += weight;
            } 
            else {
                days++;
                load = weight;
            }

        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int maxi =0;
        for(int i=0;i<weights.length;i++){
            maxi +=weights[i];
            if(weights[i]>max){
                max=weights[i];
            }
        }
        int low = max ;
        int high = maxi ;
        while(low<= high ){
            int mid = (low + high )/2;
            int requiredDays = capacity(weights , mid);
            if(requiredDays<=days){
                high=mid-1;
            }else low = mid+1;
        }
        return low ;
    }
}