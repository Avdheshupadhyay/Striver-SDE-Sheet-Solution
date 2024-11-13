class Solution {
    int idx=0;
    TreeNode solve(int []pre,int start,int end,Map<Integer,Integer> map){
        if(start>end){
            return null;
        }
        int element=pre[idx++];
        TreeNode root=new TreeNode(element);
        int pos=map.get(element);
        root.left=solve(pre,start,pos-1,map);
        root.right=solve(pre,pos+1,end,map);
        return root;
    }
    public TreeNode buildTree(int[] pre, int[] in) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        int start=0;
        int end=in.length-1;
        TreeNode root=solve(pre,start,end,map);
        return root;

        
    }
}