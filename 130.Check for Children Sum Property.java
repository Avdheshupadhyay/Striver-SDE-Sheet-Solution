boolean isSumProperty(Node root) {
    if (root == null) {
        return true;
    }

    if (root.left == null && root.right == null) {
        return true;
    }

    int leftData = (root.left != null) ? root.left.data : 0;
    int rightData = (root.right != null) ? root.right.data : 0;

    if (root.data == leftData + rightData
        && isSumProperty(root.left)
        && isSumProperty(root.right)) {
        return true;
    }

    return false;
}