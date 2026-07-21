// Last updated: 21/07/2026, 13:56:56
1class Solution {
2    public int[] beautifulArray(int n) {
3        int[] ans = new int[n];
4        if(n==1){
5            ans[0] = 1;
6            return ans;
7        }
8        int[] r = beautifulArray(n/2);
9        int[] l = beautifulArray((n+1)/2);
10        for(int i= l.length;i<n;i++){
11            ans[i] = r[i-l.length]*2;
12        }
13        for(int i=0;i<l.length;i++){
14            ans[i] = l[i]*2-1;
15        }
16        return ans;
17    }
18}