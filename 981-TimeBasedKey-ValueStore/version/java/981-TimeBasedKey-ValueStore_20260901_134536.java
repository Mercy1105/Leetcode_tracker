// Last updated: 01/09/2026, 13:45:36
1class TimeMap {
2public Map<String, TreeMap<Integer, String>> map;
3    public TimeMap() {
4        map = new HashMap<>();
5
6    }
7    
8    public void set(String key, String value, int timestamp) {
9        if (map.containsKey(key)) {
10            map.get(key).put(timestamp, value);
11        }
12        else {
13            TreeMap<Integer, String> t = new TreeMap<>();
14            t.put(timestamp, value);
15            map.put(key,t);
16        }
17    }
18    
19    public String get(String key, int timestamp) {
20        if (map.containsKey(key)) {
21            Map.Entry<Integer, String> entry = map.get(key).floorEntry(timestamp); // helps returnning the the same timestamp or preivious timestamp
22            if (entry != null)
23                return entry.getValue();
24        }
25        return "";
26    }
27}
28
29/**
30 * Your TimeMap object will be instantiated and called as such:
31 * TimeMap obj = new TimeMap();
32 * obj.set(key,value,timestamp);
33 * String param_2 = obj.get(key,timestamp);
34 */