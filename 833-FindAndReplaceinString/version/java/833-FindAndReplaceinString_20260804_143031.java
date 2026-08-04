// Last updated: 04/08/2026, 14:30:31
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        int n = s.length();
4        int[] match = new int[n];
5        Arrays.fill(match, -1);
6
7        for(int i = 0; i < indices.length; i++){
8            if(indices[i] + sources[i].length() <= s.length() && s.substring(indices[i], indices[i] + sources[i].length()).equals(sources[i])){
9                match[indices[i]] = i;
10            }
11        }
12
13        StringBuilder sb = new StringBuilder();
14        int idx = 0;
15        while(idx < n){
16            if(match[idx] != -1){
17                sb.append(targets[match[idx]]);
18                idx += sources[match[idx]].length();
19            }
20            else{
21                sb.append(s.charAt(idx));
22                idx++;
23            }
24        }
25
26        return sb.toString();
27        
28    }
29}