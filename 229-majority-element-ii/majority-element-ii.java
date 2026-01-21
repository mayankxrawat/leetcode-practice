class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int el1 =0 , el2 =0;
       int cnt1 = 0 , cnt2 =0;
      
       for(int i=0;i<nums.length;i++){
        int num = nums[i];
        if( cnt1 == 0 && num != el2 ){
            el1 = num;
            cnt1=1;
        }
        else if(el1 == nums[i] ){
            cnt1++;
        }
         else if( cnt2 == 0 && num != el1 ){
            el2 = num;
            cnt2=1;
        }
        else if(el2 == nums[i] ){
            cnt2++;
        }
        else{
         cnt1-- ;
         cnt2--;
        }
       }
       int cntr1 = 0;
       int  cntr2 = 0 ;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==el1){
            cntr1 ++;

        }
        else if ( nums[i]==el2){
            cntr2++;
        }
       }
       List<Integer> result = new ArrayList<>();
       int n = nums.length;
       if(cntr1 > n/3) result.add(el1);
         if(cntr2 > n/3) result.add(el2);
         return result;
    }
}