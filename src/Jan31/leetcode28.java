package Jan31;

import Jan17.TreeNode;

/**
 * @author Baller_Xiao
 * @Description
 * 判断二叉树是否镜像
 * 法一：递归
 * 法二：队列
 * @create_time 2021-01-31 21:08
 * @return
 * @Version
 */
public class leetcode28
{
    public boolean isSymmetric(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        return check(root.left,root.right);
    }
    public boolean check(TreeNode root1,TreeNode root2)
    {
        if(root1==null&&root2==null)
        {
            return true;
        }
        if(root1==null||root2==null||root1.val!=root2.val)
        {
            return false;
        }
        return check(root1.left,root2.right)&&check(root1.right,root2.left);
    }

}
