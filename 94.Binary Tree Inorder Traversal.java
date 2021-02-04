class Solution {
    public List<Integer> inorder(List<Integer> list,TreeNode root)
    {
        if(root==null)
            return list;
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        list=inorder(list,root);
        return list;
    }
}
