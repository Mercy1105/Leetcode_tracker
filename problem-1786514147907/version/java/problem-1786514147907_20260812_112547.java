// Last updated: 12/08/2026, 11:25:47
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if(s1.length() > s2.length()) return false;
4        int l = 0;
5        int[] counter1 = new int[26];
6        int[] counter2 = new int[26];
7        for(Character s: s1.toCharArray()) {
8            counter1[s - 'a']++;
9        }
10        for(int r = 0; r < s2.length(); r++) {
11            int index = s2.charAt(r) - 'a';
12            counter2[index]++;
13            while(r-l+1 > s1.length()) {
14                counter2[s2.charAt(l++) - 'a']--;
15            }          
16            if(Arrays.equals(counter1, counter2)) return true;        
17        }
18        return false;
19    }
20}