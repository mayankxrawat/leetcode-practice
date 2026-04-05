class Solution {
    public boolean judgeCircle(String moves) {
        int  up = 0;
        int down =0;
        int left =0;
        int right =0;
        for(int i=0; i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                up++;
            }
            else if(moves.charAt(i)=='D'){
                down++;
            }
            else if(moves.charAt(i)=='L'){
                left++;
            }
            else{
                right++;
            }
        }
        if ( up == down && left == right){
            return true;
        }
    return false;
    }
}