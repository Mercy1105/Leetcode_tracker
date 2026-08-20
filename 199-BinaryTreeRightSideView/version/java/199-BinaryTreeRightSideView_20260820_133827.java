// Last updated: 20/08/2026, 13:38:27
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer>list =  new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        if (root!=null) q.add(root);
21        while(!q.isEmpty()){
22            int size = q.size();
23            for(int i = 0; i < size; i++){
24                TreeNode removal = q.remove();
25                if(i == size-1)
26                list.add(removal.val);
27
28                if(removal.left !=null)
29                    q.add(removal.left);
30                if(removal.right !=null)
31                   q.add(removal.right);
32            }
33        }
34        return list;
35    }
36}