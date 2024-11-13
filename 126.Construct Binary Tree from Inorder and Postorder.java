
class Solution {
    int idx;
    TreeNode solve(int[] post,int start,int end,Map<Integer,Integer> map){
        if(start>end){
            return null;
        }
        int element=post[idx--];
        int pos=map.get(element);
        TreeNode root=new TreeNode(element);
        root.right=solve(post,pos+1,end,map);
        root.left=solve(post,start,pos-1,map);
        return root;
    }
    public TreeNode buildTree(int[] in, int[] post) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        int start=0;
        int end=in.length-1;
        idx=post.length-1;
        TreeNode root=solve(post,start,end,map);
        return root;
        
    }
}