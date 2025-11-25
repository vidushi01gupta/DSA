/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public static TreeNode sortedListToBST(ListNode head) {
        java.util.List<Integer> values = new java.util.ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return createBST(values, 0, values.size() - 1);
    }
    public static TreeNode createBST(java.util.List<Integer> values, int st,int end) {
         if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        TreeNode root=new TreeNode(values.get(mid));
        root.left=createBST(values,st,mid-1);
        root.right=createBST(values,mid+1,end);
        return root;
    }
}