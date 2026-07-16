class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        
        int count = 0;
       

      for(int r = 0;r<s.length() ;r++)
      {
        while(set.contains(s.charAt(r)))
        {
            set.remove(s.charAt(left));
            left++;
        }
         set.add(s.charAt(r));
         count = Math.max(count, r-left+1);
      }
      return count;
    }
}
