class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> s= new HashSet<>();
        for(String str : deadends) s.add(str);
        if (s.contains("0000")) return -1;
        int n= target.length();
        Queue<String> q= new LinkedList<>();
        q.add("0000");
        s.add("0000");
        int step=0;
        while(!q.isEmpty()){
            int size= q.size();
            while(size-->0){
                String curr= q.poll();
                if(curr.equals(target)) return step;
                char[] arr= curr.toCharArray();
                for(int i=0; i<n; i++){
                    //backup
                    char original= arr[i];
                    // +1
                    arr[i] = (char)((arr[i] - '0' + 1) % 10 + '0');
                    String s1= new String(arr);
                    if(!s.contains(s1)) {
                        q.add(s1);
                        s.add(s1);
                    }
                    //-1
                    arr[i] = (char)((original - '0' - 1 +10) % 10 + '0');
                    String s2= new String(arr);
                    if(!s.contains(s2)) {
                        q.add(s2);
                        s.add(s2);
                    }
                    //put it back
                    arr[i]=original;

                }
            }
                step++;
        }
            return -1;

    }
}