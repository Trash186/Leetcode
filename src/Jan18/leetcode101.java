package Jan18;

import Jan17.TreeNode;

/**
 * @author Baller_Xiao
 * @Description
 * 对称二叉树
 * 采用递归法
 * 再写一个函数，返回值为boolean，比较左子树和右子树的值
 * @create_time 2021-01-18 18:17
 * @return
 * @Version
 */
public class leetcode101
{
    public boolean isSymmetric(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        return cmp(root.left,root.right);
    }

    public boolean cmp(TreeNode t1,TreeNode t2)
    {
        if(t1==null&&t2==null)
        {
            return true;
        }
        if(t1==null||t2==null||t1.val!=t2.val)
        {
            return false;
        }
        return cmp(t1.left,t2.right)&&cmp(t1.right,t2.left);
    }
}
