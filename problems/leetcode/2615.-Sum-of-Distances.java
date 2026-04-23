class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        HashMap<Integer,List<Integer>> map= new HashMap<>();
        for(int i=0; i<n; i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        long[] result= new long[n];
        for(int i=0; i<n; i++){
            List<Integer> l= map.get(nums[i]);
            long s=0;
            for(int index : l){
                if(i==index) continue;
                s+=Math.abs(i-index);
            }
            result[i]=s;
        }
        return result;
    }
}