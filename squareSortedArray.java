class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int[] re = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int p = n - 1; p >= 0; p--) {
            if (nums[l] > nums[r]) {
                re[p] = nums[l];
                l++;
            } else {
                re[p] = nums[r];
                r--;
            }
        }

        return re;
    }
}