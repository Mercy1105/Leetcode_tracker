// Last updated: 21/07/2026, 14:05:29
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        LinkedList<Integer> ans = new LinkedList<>();
19	Stack<TreeNode> stack = new Stack<>();
20	if (root == null) return ans;
21	stack.push(root);
22	while (!stack.isEmpty()) {
23		TreeNode cur = stack.pop();
24		ans.addFirst(cur.val);
25		if (cur.left != null) {
26			stack.push(cur.left);
27		}
28		if (cur.right != null) {
29			stack.push(cur.right);
30		} 
31	}
32	return ans;
33    }
34}