// Last updated: 21/08/2026, 11:56:59
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isCompleteTree(TreeNode root) {
18        if (root == null)
19      return true;
20    Queue<TreeNode> q = new LinkedList<>(Arrays.asList(root));
21    while (q.peek() != null) {
22      TreeNode node = q.poll();
23      q.offer(node.left);
24      q.offer(node.right);
25    }
26    while (!q.isEmpty() && q.peek() == null)
27      q.poll();
28    return q.isEmpty();
29    }
30}