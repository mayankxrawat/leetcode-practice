class Solution {
    public boolean validMountainArray(int[] arr) {
        int maxEleIdx = -1;
        int maxEle =0;
        if(arr.length<3){
            return false;
        }
        for ( int i=0 ; i< arr.length ;i++){
            if(arr[i]> maxEle){
                maxEle = arr[i];
                maxEleIdx = i;
            }
        }
  
        if (maxEleIdx == 0 || maxEleIdx == arr.length - 1) {
            return false;
        }

        for(int i = maxEleIdx ; i>0 ;i--){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }

          for(int i = maxEleIdx ; i<arr.length-1 ;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true ;
    }
}