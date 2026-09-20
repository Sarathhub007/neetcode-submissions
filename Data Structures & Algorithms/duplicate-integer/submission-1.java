class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        boolean rigth=false;
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(nums[i]==nums[j]&& i!=j){
                rigth=true;
            }
        }

        }
        if(rigth){
            return true;
        }
        return false;
    }
}