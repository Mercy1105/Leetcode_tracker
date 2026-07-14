// Last updated: 14/07/2026, 14:18:31
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl=0;
        Set<Character> set=new HashSet<>();
        int start=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxl=Math.max(maxl,i-start+1);
        }
        return maxl;
    }
}
