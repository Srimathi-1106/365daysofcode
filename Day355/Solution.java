// LEETCODE PROBLEM - 2196. Create Binary Tree From Descriptions

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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map=new HashMap<>();
        Set<Integer> hasParent=new HashSet<>();
        for(int[] description:descriptions)
        {
            if(!map.containsKey(description[0]))
            {
                map.put(description[0],new TreeNode(description[0]));
            }
            if(!map.containsKey(description[1]))
            {
                map.put(description[1],new TreeNode(description[1]));
            }
            hasParent.add(description[1]);
    
        }
        TreeNode root=null;
        for(int[] description:descriptions)
        {
            if(description[2]==1)
            {
                map.get(description[0]).left=map.get(description[1]);
            }
            else
            {
                map.get(description[0]).right=map.get(description[1]);
            }
            if(!hasParent.contains(description[0]))
            root=map.get(description[0]);
        }
        return root;
    }
}