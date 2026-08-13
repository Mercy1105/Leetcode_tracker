// Last updated: 13/08/2026, 12:21:16
1class Solution {
2    Map<Integer, Integer> closePos = new HashMap<>();
3    public String decodeString(String s) {
4        Stack<Integer> st = new Stack<>();
5        for (int i = 0; i < s.length(); ++i) {
6            if (s.charAt(i) == '[')
7                st.push(i);
8            else if (s.charAt(i) == ']')
9                closePos.put(st.pop(), i);
10        }
11        return solve(s, 0, s.length() - 1);
12    }
13    String solve(String s, int l, int r) {
14        StringBuilder sb = new StringBuilder();
15        int num = 0;
16        while (l <= r) {
17            char c = s.charAt(l);
18            if (Character.isDigit(c))
19                num = num * 10 + c - '0';
20            else if (c == '[') {
21                sb.append(solve(s, l + 1, closePos.get(l) - 1).repeat(num));
22                num = 0;
23                l = closePos.get(l);
24            } else {
25                sb.append(c);
26            }
27            l += 1;
28        }
29        return sb.toString();
30    }
31}