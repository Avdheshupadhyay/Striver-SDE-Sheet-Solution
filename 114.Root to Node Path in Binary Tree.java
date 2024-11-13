public class Solution {
    public boolean getPath(TreeNode root, List<Integer> arr, int x) {
        if (root == null) {
            return false;
        }
        arr.add(root.val);
        if (root.val == x) {
            return true;
        }
        if (getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }

    public List<Integer> solve(TreeNode A, int B) {
        List<Integer> arr = new ArrayList<>();
        if (A == null) {
            return arr;
        }
        getPath(A, arr, B);
        return arr;
    }