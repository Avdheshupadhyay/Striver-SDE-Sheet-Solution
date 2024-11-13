private static void singleTraversalHelper(TreeNode root) {
    if (root == null) {
        return;
    }
    
    System.out.print("Preorder: " + root.val + " ");
    if (root.left != null || root.right != null) {
        System.out.print("Inorder: ");
        singleTraversalHelper(root.left);
        System.out.print(root.val + " ");
        singleTraversalHelper(root.right);
        System.out.println("Postorder: " + root.val);
    }
}
