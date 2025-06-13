class Solution {
    // Main function
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        // You can use either of the following:
        return isMirror(root.left, root.right); // Recursive
        // return isMirrorIterative(root);       // Iterative
    }

    // \U0001f501 Recursive helper
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null || t1.val != t2.val) return false;

        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

    // \U0001f501 Iterative helper using Queue
    private boolean isMirrorIterative(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();

            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null || t1.val != t2.val) return false;

            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }
        return true;
    }
}
