class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length;   
while (low < high) {
    int mid = low + (high - low) / 2;
    if (mid < arr.length && arr[mid] - (mid + 1) < k) {
        low = mid + 1;
    } else {
        high = mid;
    }
}
return low + k;
    }
}