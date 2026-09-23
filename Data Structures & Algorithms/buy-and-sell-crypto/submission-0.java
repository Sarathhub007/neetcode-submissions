class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int small=arr[0];
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                small=arr[i];
            }
            max=Math.max(max,arr[i]-small);
            
        }
        return max;
        
    }
}
