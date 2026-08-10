// Last updated: 10/08/2026, 11:51:57
1class Solution {
2    public boolean isPossible(int[] nums) {
3        PriorityQueue<int[]> heap = new PriorityQueue<>(
4                (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
5        for (int num : nums) {
6            while (!heap.isEmpty() && heap.peek()[0] < num - 1) {
7                if (heap.poll()[1] < 3) {
8                    return false;
9                }
10            }
11            if (!heap.isEmpty() && heap.peek()[0] == num - 1) {
12                int[] top = heap.poll();
13                heap.offer(new int[] { num, top[1] + 1 });
14            } else {
15                heap.offer(new int[] { num, 1 });
16            }
17        }
18        while (!heap.isEmpty()) {
19            if (heap.poll()[1] < 3) {
20                return false;
21            }
22        }
23        return true;
24    }
25}