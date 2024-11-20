class Solution {
    public int[] twoSum(int[] arr, int target) {
        int []out=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i!=j)&&(arr[i]+arr[j]==target)){
                    out[0]=i;
                    out[1]=j;
                }
            }
        }
        return out;
    }
}