// Last updated: 01/09/2026, 13:55:17
1class Solution {
2    public List<String> subdomainVisits(String[] cpdomains) {
3        Map<String, Integer> map = new HashMap<>();
4        for (String domainCount : cpdomains) {
5            int spaceIndex = domainCount.indexOf(' ');
6            int count = Integer.parseInt(domainCount.substring(0, spaceIndex));
7            String domain = domainCount.substring(spaceIndex + 1);
8            while (true) {
9                map.merge(domain, count, Integer::sum);
10                int dotIndex = domain.indexOf('.');
11                if (dotIndex == -1) break;
12                domain = domain.substring(dotIndex + 1);
13            }
14        }
15        List<String> result = new ArrayList<>(map.size());
16        for (Map.Entry<String, Integer> entry : map.entrySet()) {
17            result.add(entry.getValue() + " " + entry.getKey());
18        }
19        return result;
20    }
21}