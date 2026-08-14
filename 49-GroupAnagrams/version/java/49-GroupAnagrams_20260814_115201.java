// Last updated: 14/08/2026, 11:52:01
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4         for(String str:strs){
5            char[] ch=str.toCharArray();
6             Arrays.sort(ch);
7             String st=new String(ch);
8          if (!map.containsKey(st)) {
9                map.put(st, new ArrayList<>());
10            }
11         map.get(st).add(str);
12           }
13            return new ArrayList<>(map.values());
14    }
15}