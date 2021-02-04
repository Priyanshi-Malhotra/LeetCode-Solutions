class Solution {
    public int minElement(TreeNode root)
    {
        if(root==null)
            return Integer.MAX_VALUE;
        if(root.left==null)
            return root.val;
        return minElement(root.left);
    }
    public int maxElement(TreeNode root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        if(root.right==null)
            return root.val;
        return maxElement(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null || (root.right==null && root.left==null))
            return true;
        if((root.right!=null && root.right.val<=root.val) || (root.left!=null && root.left.val>=root.val) ||
          (root.val!=Integer.MAX_VALUE && minElement(root.right)<=root.val) || (root.val!=Integer.MIN_VALUE && maxElement(root.left)>=root.val))
            return false;
        return (isValidBST(root.left) && isValidBST(root.right));
    }
}
