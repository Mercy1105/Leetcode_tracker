// Last updated: 31/07/2026, 11:50:21
1class Solution {
2    public boolean canConvertString(String s, String t, int k) {
3       if (s.length() != t.length()) {
4            return false;
5        }
6        int[] character = new int[26];
7        for (int i = 0; i < s.length(); i++) {
8            int shift = (t.charAt(i) - s.charAt(i) + 26) % 26;
9            character[shift]++;
10        }
11        for (int i = 1; i < 26; i++) {
12            if (i + (character[i] - 1) * 26 > k) {
13                return false;
14            }
15        }
16        return true; 
17    }
18}