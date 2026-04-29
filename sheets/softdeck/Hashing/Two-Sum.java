class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        result[0]=-1;
        result[1]=-1;
        int n= nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}