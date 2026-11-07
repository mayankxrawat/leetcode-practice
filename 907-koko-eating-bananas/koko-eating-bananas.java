class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int low = 1;                          // minimum possible speed
        int high = 0;                         // will become max(piles)
        for (int p : piles) high = Math.max(high, p);

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, mid, h)) {
                high = mid;                   // mid works → try slower
            } else {
                low = mid + 1;                // mid too slow → go faster
            }
        }
        return low;                           // smallest speed that works
    }

    private boolean canFinish(int[] piles, int k, int h) {
        long hours = 0;
        for (int p : piles) {
            hours += (p + k - 1) / k;         // ceil(p / k)
            if (hours > h) return false;      // early exit
        }
        return hours <= h;
    }
}