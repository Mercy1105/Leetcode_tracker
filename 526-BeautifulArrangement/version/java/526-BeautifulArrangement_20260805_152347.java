// Last updated: 05/08/2026, 15:23:47
1class Solution {
2    int count=0;
3    public int countArrangement(int n) {
4        int num[] = new int[n+1];
5        helper(num,1,n);
6        return count;
7    }
8    public void helper(int num[], int val, int n){
9        if(val>n){
10            count++;
11            return;
12        }
13        for(int i=1;i<=n;i++){
14            if(num[i]==0 && (i%val==0 || val%i==0)){
15                num[i]=1;
16                helper(num,val+1,n);
17                num[i]=0;
18            }
19        }
20    }
21}