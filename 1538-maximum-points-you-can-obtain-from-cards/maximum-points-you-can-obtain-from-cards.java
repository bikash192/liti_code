class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ls=0,rs=0,max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            ls=ls+cardPoints[i];
        }
        max=ls;
        int ri=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            ls=ls-cardPoints[i];
            rs=rs+cardPoints[ri];
            ri--;
            max=Math.max(max,ls+rs);
        }
        return max;
    }
}