class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char [] a = s.toCharArray();
        char [] a1 = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(a1);
        s = new String(a);
        t =  new String(a1);
        return(s.equals(t));
    }
}