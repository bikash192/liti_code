class Solution {
    public int find(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        int cnt=0;
      Map<Integer,Integer> mp=new HashMap<>();
      for(int i=1;i<=n;i++){
        int ds=find(i);
        if(!mp.containsKey(ds)){
            mp.put(ds,1);
        }
        else{
            mp.put(ds,mp.get(ds)+1);
        }
      }
      int max=0;
      for(int k:mp.values()){
        max=Math.max(k,max);
      }
      for(int k:mp.values()){
        if(k==max)cnt++;
      }
      return cnt;
    }
}