// LEETCODE PROBLEM - 1110. Delete Nodes And Return Forest

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean toDelete[]=new boolean[1001];
    private List<TreeNode> forest=new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int to_del:to_delete)
        {
            toDelete[to_del]=true;
        }
        if(processNode(root)!=null)
            forest.add(root);
        return forest;
    }

    private TreeNode processNode(TreeNode node){
        if(node==null)
        return null;

        node.left=processNode(node.left);
        node.right=processNode(node.right);

        if(toDelete[node.val])
        {
            if(node.left!=null)
            {
                forest.add(node.left);
            }
            if(node.right!=null)
            {
                forest.add(node.right);
            }
            return null;
        }
        return node;
    }
}