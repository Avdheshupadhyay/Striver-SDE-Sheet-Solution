class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            List<Integer> a = new ArrayList<>();
            int n = qu.size();
            for (int i = 0; i < n; i++) {
                TreeNode str = qu.poll();
                a.add(str.val);
                if (str.left != null)
                    qu.add(str.left);
                if (str.right != null)
                    qu.add(str.right);
            }
            ans.add(a);
        }
        return ans;

    }
}