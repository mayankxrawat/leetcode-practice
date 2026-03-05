class Solution {
    public int minOperations(String s) {
       int count1=0; //pattern 0101 Odd places 0
       int count2=0; //pattern 1010 odd places 1
       int n=s.length();
        for(int i=0;i<n;i++){
         char ch = s.charAt(i); 
         //pattern 0101  
            if(i % 2 == 0 && ch != '0') count1++;
            if(i % 2 == 1 && ch != '1') count1++;
            //pattern 1010
            if(i % 2 == 0 && ch != '1') count2++;
            if(i % 2 == 1 && ch != '0') count2++;
        }
    return Math.min(count1 , count2);
    }
}