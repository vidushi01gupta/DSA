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
    public static int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    public static int helper(TreeNode node, int currentSum) {
        if (node == null) {
            return 0;
        }
        currentSum=currentSum*10 + node.val;

        if (node.left == null && node.right == null) {
            return currentSum;
        }
        int leftSum = helper(node.left, currentSum);
        int rightSum = helper(node.right, currentSum);
        return leftSum + rightSum;
    }
}