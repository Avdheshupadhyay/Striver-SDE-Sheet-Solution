
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode store=q.poll();
                a.add(store.val);
                if(store.left!=null){
                    q.add(store.left);
                }
                if(store.right!=null){
                    q.add(store.right);
                }
            }
            if(flag==true){
                ans.add(a);
            }
            else{
                Collections.reverse(a);
                ans.add(a);
            }
            flag=!flag;
        }
        return ans;
        
    }
}