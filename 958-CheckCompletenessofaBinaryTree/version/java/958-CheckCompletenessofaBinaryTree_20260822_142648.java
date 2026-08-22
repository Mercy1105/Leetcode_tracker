// Last updated: 22/08/2026, 14:26:48
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String concatenated = s + s;
4        return concatenated.substring(1, concatenated.length() - 1).contains(s);
5    }
6}