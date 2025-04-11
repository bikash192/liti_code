class Solution {
    public int check(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public boolean checksum(String s){
        int n=s.length();
        int sum1=0,sum2=0;
        for(int i=0;i<n/2;i++){
            int num= s.charAt(i)-'0';
            sum1+=num;
        }
        for(int j=n/2;j<n;j++){
            int num= s.charAt(j)-'0';
            sum2+=num;
        }
        return sum1==sum2;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(check(i)%2==0){
                String str=Integer.toString(i);
                if(checksum(str)){
                    count++;
                }
            }
        }
        return count;
    }
}