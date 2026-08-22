// Last updated: 22/08/2026, 14:31:25
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11    private int index = 0;
12
13    // Encodes a tree to a single string.
14    public String serialize(TreeNode root) {
15        StringBuilder sb = new StringBuilder();
16        preorder(root, sb);
17        return sb.toString();
18    }
19    private void preorder(TreeNode root, StringBuilder sb) {
20        if (root == null)
21            return;
22        sb.append(root.val).append(",");
23        preorder(root.left, sb);
24        preorder(root.right, sb);
25    }
26    // Decodes your encoded data to tree.
27    public TreeNode deserialize(String data) {
28        if (data.isEmpty())
29            return null;
30        String[] arr = data.split(",");
31        index = 0;
32        return build(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
33    }
34
35    private TreeNode build(String[] arr, int min, int max) {
36        if (index == arr.length)
37            return null;
38        int val = Integer.parseInt(arr[index]);
39        if (val < min || val > max)
40            return null;
41        index++;
42        TreeNode root = new TreeNode(val);
43        root.left = build(arr, min, val);
44        root.right = build(arr, val, max);
45        return root;
46    }
47}
48
49// Your Codec object will be instantiated and called as such:
50// Codec ser = new Codec();
51// Codec deser = new Codec();
52// String tree = ser.serialize(root);
53// TreeNode ans = deser.deserialize(tree);
54// return ans;