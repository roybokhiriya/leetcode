class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int currentNumber) {
        if (node == null) return 0;

        currentNumber = currentNumber * 10 + node.val;

        if (node.left == null && node.right == null) {
            return currentNumber;
        }

        int leftSum = dfs(node.left, currentNumber);
        int rightSum = dfs(node.right, currentNumber);

        return leftSum + rightSum;
    }
}
