class Solution {
    ArrayList<Integer> ans=new ArrayList<>();
  public List<Integer> inorderTraversal(TreeNode root) {
      if(root==null){
          return new ArrayList<>();
      }
      else{
      inorderTraversal(root.left);
      ans.add(root.val);
      inorderTraversal(root.right);
      return ans; 
      }  
  }
}
