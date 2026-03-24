class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length; //row
        int m = matrix[0].length; //column 
        int left = 0; //left ptr
        int right= m-1; // right ptr
        int top =0;
        int low = n-1;
        while ( top <= low && left<= right ){
            //top row 
            for(int i = left ; i<=right ;i++){
                result.add(matrix[top][i]);
              
            }
              top++;
            //right column 
            for(int i = top ; i<=low ; i++ ){
                result.add(matrix[i][right]);
               
            }
             right--;
            //bottom row 
            if(top<=low){
                for(int i =right; i>= left ; i--){
                result.add(matrix[low][i]);
                
                }
                low--;
                
            }
            //left row
            if(left<=right){
                for(int i= low ;i>=top;i--){
                    result.add(matrix[i][left]);
                    
                }
                left++;
            }
        } 
        return result ;

    }
}