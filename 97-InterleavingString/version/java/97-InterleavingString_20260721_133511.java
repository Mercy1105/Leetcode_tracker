// Last updated: 21/07/2026, 13:35:11
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray(), c3 = s3.toCharArray();
4	int m = s1.length(), n = s2.length();
5	if(m + n != s3.length()) return false;
6	return dfs(c1, c2, c3, 0, 0, 0, new boolean[m + 1][n + 1]);
7}
8
9public boolean dfs(char[] c1, char[] c2, char[] c3, int i, int j, int k, boolean[][] invalid) {
10	if(invalid[i][j]) return false;
11	if(k == c3.length) return true;
12	boolean valid = 
13	    i < c1.length && c1[i] == c3[k] && dfs(c1, c2, c3, i + 1, j, k + 1, invalid) || 
14        j < c2.length && c2[j] == c3[k] && dfs(c1, c2, c3, i, j + 1, k + 1, invalid);
15	if(!valid) invalid[i][j] = true;
16    return valid;
17
18    }
19}