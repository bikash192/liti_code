class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int cur=0,minV=0,maxV=0;
        for(int i=0;i<differences.length;i++){
            cur+=differences[i];
            minV=Math.min(minV,cur);
            maxV=Math.max(maxV,cur);
            if((upper-maxV)-(lower-minV)+1<=0) return 0;
        }
        return (upper-maxV)-(lower-minV)+1;
    }
}