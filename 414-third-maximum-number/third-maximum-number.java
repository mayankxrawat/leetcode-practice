class Solution {
    public int thirdMax(int[] nums) {
         Integer largest = null;
        Integer seclargest = null;
        Integer thirdlargest = null;

        for (int num : nums) {
            if ((largest != null && num == largest) ||
                (seclargest != null && num == seclargest) ||
                (thirdlargest != null && num == thirdlargest)) {
                continue;
            }
            if (largest == null || num > largest) {
                thirdlargest = seclargest;
                seclargest = largest;
                largest = num;
            }
            else if (seclargest == null || num > seclargest) {
                thirdlargest = seclargest;
                seclargest = num;
            }
            else if (thirdlargest == null || num > thirdlargest) {
                thirdlargest = num;
            }
        }

        return (thirdlargest == null) ? largest : thirdlargest;
    }
}