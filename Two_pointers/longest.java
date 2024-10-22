class Solution {
    public int longestMountain(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        int ans = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                int right = i;
                while (right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int total = right - left + 1;
                ans = Math.max(ans, total);
                i = right;
            }
        }
        return ans;
    }
}