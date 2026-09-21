class Solution {
    public void swap(int left,int right,char[] ch){
      
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
        
    }
    public int minSwaps(String s) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        int left=0;
        int right=n-1;
        int balance=0;
        int count=0;
        while(left<right){
            if(ch[left]==']'){
                balance--;
            }else if(ch[left]=='['){
                balance++;
            }
    if(balance<0){
        while(ch[right]!='['){
            right--;
        }
            swap(left,right, ch);
              count++;
            //   right--;
        
              balance+=2;

    }
    left++;
        }
        return count;
    }
}