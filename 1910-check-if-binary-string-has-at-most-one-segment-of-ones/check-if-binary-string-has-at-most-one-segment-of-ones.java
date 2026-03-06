class Solution {
    public boolean checkOnesSegment(String s) {
       boolean seenzero = false;

        for(int i=1;i<s.length();i++) {
            if(s.charAt(i-1)=='1'&&s.charAt(i)=='0') {
                seenzero = true;
            }
            if(s.charAt(i)=='1'&& seenzero) {
                return false;
            }
        }
        return true;
    }
}