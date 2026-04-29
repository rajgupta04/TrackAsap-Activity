class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            int s=0;
            for(int j=i; j<n; j++){
                s+=nums[j];
                if(s==k){
                     c++;
                }
            }
        }
        return c;
    }
}