// Last updated: 12/08/2026, 11:33:26
1class Solution {
2    public int maxVowels(String s, int k) {
3        int maxVowels = 0, curr = 0;
4        for (int i = 0; i < k; i++) {
5            if (isVowel(s.charAt(i))) {
6                curr++;
7            }
8        }
9        maxVowels = curr;
10        for (int i = k; i < s.length(); i++) {
11            if (isVowel(s.charAt(i))) curr++;
12            if (isVowel(s.charAt(i - k))) curr--;
13            maxVowels = Math.max(maxVowels, curr);
14            // early exit
15            if (maxVowels == k) return k;
16        }
17        return maxVowels;
18    }
19    
20    private boolean isVowel(char c) {
21        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
22    }
23}