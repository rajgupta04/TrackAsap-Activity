class Solution {
    HashMap<String,Boolean> map= new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m!=n) return false;
        return solve(s1,s2);
    }
    boolean solve(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        if(map.containsKey(s1+s2)) return map.get(s1+s2);
        if(s1.equals(s2)){
            map.put(s1+s2,true);
             return true;
        }
        int[] freq = new int[26];

        int n=s1.length();
        for (int i=0; i<n; i++) freq[s1.charAt(i)-'a']++;
        for (int i=0; i<n; i++) freq[s2.charAt(i)-'a']--;
        for(int x : freq) 
        if(x != 0){
         map.put(s1+s2,false);
         return false;
        }
        boolean flag=false;
        for(int k=1; k<n; k++){
            if((solve(s1.substring(0,k),s2.substring(n-k,n)) &&
               solve(s1.substring(k,n),s2.substring(0,n-k))) 
               ||
               (solve(s1.substring(0,k),s2.substring(0,k)) &&
               solve(s1.substring(k,n),s2.substring(k,n))) 
               ){
                flag=true;
                break;
               }
        }
        map.put(s1+s2,flag);
        return flag;
    }
}