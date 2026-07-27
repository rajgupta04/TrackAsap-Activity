class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int result=nums[0];
        int maxx=nums[0];
        int minn=nums[0];

        for(int i=1; i<n; i++){
            int tempmax=maxx;
            maxx=Math.max(nums[i],Math.max(maxx*nums[i],minn*nums[i]));
            minn=Math.min(nums[i],Math.min(tempmax*nums[i],minn*nums[i]));
            result=Math.max(result,maxx);
        }
        return result;
    }
}