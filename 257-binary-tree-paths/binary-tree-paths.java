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
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        if (root.left == null && root.right == null) {
            result.add(String.valueOf(root.val));
            return result;
        }
        for (String path : binaryTreePaths(root.left)) {
            result.add(root.val + "->" + path);
        }
        for (String path : binaryTreePaths(root.right)) {
            result.add(root.val + "->" + path);
        }

        return result;
        
    }
}