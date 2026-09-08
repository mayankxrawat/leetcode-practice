class Solution {
    public void duplicateZeros(int[] arr) {
        int pz = 0;
        int lastIdx = arr.length-1;
        for(int i=0;i<=lastIdx-pz;i++){
            if(arr[i]==0){
                if(i==lastIdx -pz ){
                 arr[lastIdx]=0 ;
                 lastIdx -=1;
                 break;  
                }
                pz++;
            }
        }
        int newLastIdx = lastIdx - pz;
        for(int i=newLastIdx ; i>=0;i--){
            if(arr[i]==0){
                arr[i+pz]=0;
                pz--;
                arr[i+pz]=0;
            }else{
                arr[i+pz]=arr[i];
            }
        } 
    }
}