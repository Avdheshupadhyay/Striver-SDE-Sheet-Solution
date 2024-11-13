
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
          TreeNode current=root;
        while(current.val!=val){
            if(current.val<val){
                current=current.right;
            }
            else{
                current=current.left;
            }
            if(current==null){
                return null;
            }
        }
        return current;
        
    }
}