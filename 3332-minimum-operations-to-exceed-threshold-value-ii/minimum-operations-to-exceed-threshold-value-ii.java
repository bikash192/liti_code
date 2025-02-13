class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long n:nums){
            pq.offer(n);
        }
        int ans=0;
        while(true){
            if(pq.peek()>=k) break;
            long x=pq.poll();
            long y=pq.poll();
            pq.offer(Math.min(x,y)*2+Math.max(x,y));
            ans++;
        }
        return ans;
    }
}