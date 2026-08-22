class Solution {
    public int maxProduct(int n) {
        List<Integer> l= new ArrayList<>();
        while(n>0){
            l.add(n%10);
            n/=10;
        }
        l.sort(Collections.reverseOrder());
        return l.get(0)*l.get(1);
    }
}