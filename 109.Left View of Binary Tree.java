class Solution {
    void solve(Node root, int level, ArrayList<Integer> ans) {
       if (root == null) {
           return; 
       }
       if (ans.size() == level) {
           ans.add(root.data);
       }
       solve(root.left, level + 1, ans);
       solve(root.right, level + 1, ans);
   }
   ArrayList<Integer> leftView(Node root) {
       ArrayList<Integer> ans = new ArrayList<Integer>();
       solve(root, 0, ans);
       return ans;
   }
}