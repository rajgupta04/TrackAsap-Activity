class Solution {
    public int maxProduct(int n) {
        List<Integer> l= new ArrayList<>();
        while(n>0){
            l.add(n%10);
            n/=10;
        }
        l.sort(Comparator.naturalOrder());
        return l.get(l.size()-1)*l.get(l.size()-2);
    }
}