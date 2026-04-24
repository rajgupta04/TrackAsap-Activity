class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        StringBuilder sb= new StringBuilder(moves);
        StringBuilder sb1= new StringBuilder(moves);
        for(int i=0; i<moves.length(); i++){
            if(sb.charAt(i)=='_')sb.setCharAt(i,'L');
            if(sb1.charAt(i)=='_')sb1.setCharAt(i,'R');
        }
        int c1=0;
        int c2=0;
        for(int i=0; i<moves.length(); i++){
            if(sb.charAt(i)=='R') c1++;
            else c1--;
            if(sb1.charAt(i)=='R') c2++;
            else c2--;
        }
        return Math.max(Math.abs(c1),Math.abs(c2));
    }
}