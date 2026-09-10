class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        for(int i = 0;i<heights.length;i++){
            result[i]=heights[i];
        }
        Arrays.sort(result);
        int cnt =0;
        for(int i =0;i<heights.length;i++){
            if(heights[i]!=result[i]){
                cnt++;
            }
        }
        return cnt;
    }
}