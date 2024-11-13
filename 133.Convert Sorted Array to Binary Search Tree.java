class Solution {
    TreeNode solve(int start,int end,int[] nums){
      if(start>end)   return null;
      int mid=start+(end-start)/2;
      TreeNode root=new TreeNode(nums[mid]);
      root.left=solve(start,mid-1,nums);
      root.right=solve(mid+1,end,nums);
      return root;
    }
  public TreeNode sortedArrayToBST(int[] nums) {
      int start=0,end=nums.length-1;
      TreeNode root=solve(start,end,nums);
      return root;
      
  }
}