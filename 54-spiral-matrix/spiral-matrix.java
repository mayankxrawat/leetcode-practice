class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n= matrix.length;
        int m= matrix[0].length ;
        int top=0; 
        int bott=n-1;
        int left=0;
        int right=m-1;
        while(left<=right && top<=bott){
            //traversing to right 
            for(int j = left ; j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            //traverse to the bottom
            for(int i=top;i<=bott;i++){
                result.add(matrix[i][right]);
            }
            right--;
            // traverse to left 
            if(top<=bott){
                for(int j=right; j>=left;j--){
                    result.add(matrix[bott][j]);
                }
                bott--;
            }
            // traverse upward
            if(left<=right){
                for(int i=bott;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result ;
    }
}