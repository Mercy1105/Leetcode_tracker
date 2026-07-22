// Last updated: 22/07/2026, 14:03:35
1class Solution {
2    public String reverseWords(String s) {
3        String[] str = s.trim().split("\\s+");
4        String out = "";
5        for (int i = str.length - 1; i > 0; i--) {
6            out += str[i] + " ";
7        }
8        return out + str[0];
9    }
10}