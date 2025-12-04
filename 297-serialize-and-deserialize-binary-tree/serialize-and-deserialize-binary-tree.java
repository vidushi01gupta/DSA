/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if(root==null){
            return " ";
        }
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder sb= new StringBuilder();
        q.add(root);

        while(!q.isEmpty()){
        TreeNode node= q.poll();
            if(node==null){
                sb.append("null ");
                continue;
            }
            sb.append(node.val).append(" ");
            q.add(node.left);
            q.add(node.right);
        }
    
    return sb.toString().trim();
   
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if(data==null || data.trim().length()==0 ){
            return null;
        }
        String values[]=data.trim().split(" ");
        if (values[0].equals("null")) return null;
        TreeNode root= new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;

        while(!q.isEmpty() && i<values.length){
            TreeNode curr=q.poll();
            if (i<values.length && !values[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                q.add(curr.left);
            }
            i++;
            if (i < values.length && !values[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                q.add(curr.right);
            }
            i++;
            
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));