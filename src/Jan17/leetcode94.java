package Jan17;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Baller_Xiao
 * @Description
 * 中序遍历
 * 两种方法
 * 一种递归
 * 遍历左边，然后打印，然后遍历右边
 * 一种非递归  先把根节点压入栈，然后把左边的部分一次压入栈
 *   while(root != null){
 *                 stack.push(root);
 *                 root = root.left;
 *             }
 *        然后弹出，弹出时检查右子树，若有，则压入栈
 * 然后继续遍历它的左节点，然后弹出
 *   root = stack.pop();
 *             list.add(root.val);
 *             root = root.right;
 *             当前节点为空，说明左边走到头了，从栈中弹出节点并保存
 * 			然后转向右边节点，继续上面整个过程
 * @create_time 2021-01-17 22:54
 * @return
 * @Version
 */
public class leetcode94
{
//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//
//        return res;
//    }

//    public static void inorder(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left, res);
//        res.add(root.val);
//        inorder(root.right, res);
//    }
    public static List<Integer> inorderTraversal1(TreeNode root)
    {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }

    public static void main(String[] args)
    {
        TreeNode nodeA=new TreeNode(1);
        TreeNode nodeB=new TreeNode(2);
        TreeNode nodeC=new TreeNode(3);
        TreeNode nodeD=new TreeNode(4);
        TreeNode nodeE=new TreeNode(5);
        TreeNode nodeF=new TreeNode(6);

        nodeA.left=nodeB;
        nodeA.right=nodeC;

        nodeB.left=nodeD;
        nodeB.right=nodeE;

        nodeC.left=nodeF;
        nodeC.right=null;

        List<Integer> integers = inorderTraversal1(nodeA);
        System.out.println(integers);
    }
}
