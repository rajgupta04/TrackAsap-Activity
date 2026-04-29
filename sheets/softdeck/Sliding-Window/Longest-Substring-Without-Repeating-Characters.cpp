class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        HashMap<Character,Integer> map= new HashMap<>();
        int start=0;
        int maxl=0;
        for(int i=0; i<n; i++){
            char c= s.charAt(i);
            if(map.containsKey(c)){
                start=Math.max(start,map.get(c)+1);
                
            }
            maxl=Math.max(maxl,(i-start+1));
            // System.out.println("i: "+i+"MaxL"+maxl+"StartL: "+start);
            map.put(c,i);
        }
        return maxl;

    }
}