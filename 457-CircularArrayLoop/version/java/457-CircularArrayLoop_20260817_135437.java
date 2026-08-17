// Last updated: 17/08/2026, 13:54:37
1class Solution {
2    public boolean checkValidString(String s) {
3        int low = 0;
4        int high = 0;
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i) == '(') {
7                low++;
8                high++;
9            } else if (s.charAt(i) == ')') {
10                if (low > 0) {
11                    low--;
12                }
13                high--;
14            } else {
15                if (low > 0) {
16                    low--;
17                }
18                high++;
19            }
20            if (high < 0) {
21                return false;
22            }
23        }
24        return low == 0;
25    }
26}