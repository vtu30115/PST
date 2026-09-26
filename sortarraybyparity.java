class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Move left while the number is already even
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            // Move right while the number is already odd
            while (left < right && nums[right] % 2 == 1) {
                right--;
            }

            // Swap odd on left with even on right
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return nums;
    }
}
