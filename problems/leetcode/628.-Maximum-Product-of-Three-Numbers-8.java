class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=1; i<n; i++){
            pre[i]=pre[i-1]*nums[i];
        }
        
        return nums[n-1] * nums[n-2] * nums[n-3];
    }
}