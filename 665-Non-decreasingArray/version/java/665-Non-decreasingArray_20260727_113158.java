// Last updated: 27/07/2026, 11:31:58
1class Solution {
2    public int[] sortArray(int[] nums) {
3        mergeSort(nums, 0, nums.length - 1);
4        return nums;
5    }
6    private void mergeSort(int[] nums, int left, int right) {
7        if (left >= right)
8            return;
9        int mid = left + (right - left) / 2;
10        mergeSort(nums, left, mid);
11        mergeSort(nums, mid + 1, right);
12
13        merge(nums, left, mid, right);
14    }
15    private void merge(int[] nums, int left, int mid, int right) {
16        int[] temp = new int[right - left + 1];
17        int i = left;
18        int j = mid + 1;
19        int k = 0;
20        while (i <= mid && j <= right) {
21            if (nums[i] <= nums[j]) {
22                temp[k++] = nums[i++];
23            } else {
24                temp[k++] = nums[j++];
25            }
26        }
27        while (i <= mid) {
28            temp[k++] = nums[i++];
29        }
30        while (j <= right) {
31            temp[k++] = nums[j++];
32        }
33        for (i = left, k = 0; i <= right; i++, k++) {
34            nums[i] = temp[k];
35        }
36    }
37}