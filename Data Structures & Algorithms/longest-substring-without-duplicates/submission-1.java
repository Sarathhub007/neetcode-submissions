
class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> ls=new ArrayList<>();
        char[] ch=s.toCharArray();
        int n=ch.length;
        int left=0;
        int max=0;
        for(int right=0;right<n;right++){
           
            while(ls.contains(ch[right])){
                ls.remove(Character.valueOf(ch[left]));
                left++;
            }
            ls.add(ch[right]);
            max=Math.max(max,ls.size());
        }
        
        return max;
    }
}
