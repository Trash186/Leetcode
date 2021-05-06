package Jan18;

import Jan17.TreeNode;
import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

/**
 * @author Baller_Xiao
 * @Description
 * 翻转二叉树
 * @create_time 2021-01-18 13:52
 * @return
 * @Version
 */
public class leetcode226
{

    public TreeNode invert(TreeNode root)
    {

        if(root==null)
        {
            return null;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invert(root.left);
        invert(root.right);
        return root;
    }
}
