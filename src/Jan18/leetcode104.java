package Jan18;

import Jan17.TreeNode;

/**
 * @author Baller_Xiao
 * @Description
 * 计算二叉树最大深度
 * @create_time 2021-01-18 17:21
 * @return
 * @Version
 */
public class leetcode104
{
    public static int maxDepth(TreeNode root)
    {

        if(root==null)
        {
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);

        return Math.max(left,right)+1;
    }

    public static void main(String[] args)
    {
        TreeNode nodeA=new TreeNode(1);
        TreeNode nodeB=new TreeNode(2);
        TreeNode nodeC=new TreeNode(3);

        nodeA.left=nodeB;
        nodeA.right=nodeC;

        int i = maxDepth(nodeA);
        System.out.println(i);
    }
}
