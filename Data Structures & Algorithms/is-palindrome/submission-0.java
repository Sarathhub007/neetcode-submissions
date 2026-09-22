class Solution {
    public boolean isPalindrome(String s) {
      char[] ch=s.toCharArray();
      int left=0;
      int right=s.length()-1;
      while(left<right){

         if(left<right && !Character.isLetterOrDigit(ch[left])){
            left++;
            continue;
         }

         if(left<right && !Character.isLetterOrDigit(ch[right])){
            right--;
            continue;
         }


         if(Character.toLowerCase(ch[left])!=Character.toLowerCase(ch[right])){
            return false;
         }
         left++;
         right--;
      }
      return true;
    }
}
