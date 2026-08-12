// Last updated: 12/08/2026, 11:09:12
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
17    String smallestString = null;
18    public String smallestFromLeaf(TreeNode root) {
19        dfs(root, new StringBuilder());
20        return smallestString;
21    }
22    private void dfs(TreeNode node, StringBuilder currentString) {
23        if (node == null) {
24            return;
25        }
26        currentString.insert(0, (char) ('a' + node.val));
27        if (node.left == null && node.right == null) {
28            updateSmallestString(currentString.toString());
29        } else {
30            dfs(node.left, currentString);
31            dfs(node.right, currentString);
32        }
33        currentString.deleteCharAt(0);
34    }
35    private void updateSmallestString(String currentString) {
36        if (smallestString == null || currentString.compareTo(smallestString) < 0) {
37            smallestString = currentString;
38        }
39    }
40}