// Last updated: 13/08/2026, 12:17:51
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] levels1 = version1.split("\\.");
4        String[] levels2 = version2.split("\\.");
5    int length = Math.max(levels1.length, levels2.length);
6    for (int i=0; i<length; i++) {
7    	Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
8    	Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
9    	int compare = v1.compareTo(v2);
10    	if (compare != 0) {
11    		return compare;
12    	}
13    }
14    return 0;
15    }
16}