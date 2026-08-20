class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n= nums.length;
        return nums[n-1] * Math.max(nums[n-2] * nums[n-3],nums[0]*nums[1]);
    }
}