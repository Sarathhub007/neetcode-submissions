class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        int w=0;
        int max=0;
        int ans=0;

        while(left<right){
         w=Math.min(arr[left],arr[right]);
        int h=(right-left);
         ans=w*h;
        max=Math.max(max,ans);
        if(arr[left]<arr[right]){
            left++;
        }else{
            right--;
        }

        }
        return max;
    }
}
