package Jan17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Baller_Xiao
 * @Description
 * 前序遍历二叉树
 * 和后置遍历差不多
 * 只是需要把弹出栈的子节点翻转
 * @create_time 2021-01-17 20:02
 * @return
 * @Version
 */
public class leetcode589
{
    public List<Integer> preOrder(Node root)
    {
        LinkedList<Node> stack=new LinkedList<>();
        LinkedList<Integer> output=new LinkedList<>();

        if(root==null)
        {
            return output;
        }
        stack.add(root);
        while(!stack.isEmpty())
        {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for(Node item:node.children)
            {
                if(item!=null)
                {
                    stack.add(item);
                }
            }
        }
        return output;
    }
}
