// Last updated: 22/07/2026, 14:29:07
1class Solution {
2    public String reorganizeString(String s) {
3        int[] count = new int[26];
4        for (char c : s.toCharArray()) {
5            count[c - 'a']++;
6        }
7        PriorityQueue<int[]> pq = new PriorityQueue<>(
8            (a, b) -> b[0] - a[0]
9        );
10        for (int i = 0; i < 26; i++) {
11            if (count[i] > 0) {
12                pq.offer(new int[]{count[i], i});
13            }
14        }
15        StringBuilder ans = new StringBuilder();
16        while (pq.size() > 1) {
17            int[] first = pq.poll();
18            int[] second = pq.poll();
19            int f1 = first[0];
20            int c1 = first[1];
21            int f2 = second[0];
22            int c2 = second[1];
23            ans.append((char)(c1 + 'a'));
24            ans.append((char)(c2 + 'a'));
25            if (--f1 > 0) {
26                pq.offer(new int[]{f1, c1});
27            }
28            if (--f2 > 0) {
29                pq.offer(new int[]{f2, c2});
30            }
31        }
32        if (!pq.isEmpty()) {
33            int[] last = pq.poll();
34            int freq = last[0];
35            int ch = last[1];
36
37            if (freq > 1) {
38                return "";
39            }
40            ans.append((char)(ch + 'a'));
41        }
42        return ans.toString();
43    }
44}