package Jan17;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Baller_Xiao
 * @Description
 * 后置遍历多叉树
 * 先把根节点放进栈，然后弹出来
 * 然后把子节点放进栈，然后弹出来
 * 然后把子节点的子节点放进栈，然后弹出来
 * 用linkedlist可以代理stack
 * addFirst push从头加入
 * add 从末尾加入
 * @create_time 2021-01-17 18:55
 * @return
 * @Version
 */
public class Leetcode590
{
    public List<Integer> postorder(Node root)
    {
        LinkedList<Node> stack=new LinkedList<>();
        LinkedList<Integer> list=new LinkedList<>();


        if(root==null)
        {
            return list;
        }
        stack.add(root);
        while(!stack.isEmpty())
        {
            Node node = stack.pollLast();
            list.addFirst(node.val);
            for(Node item:node.children)
            {
                if(item!=null)
                {
                    stack.add(item);
                }
            }

        }
        return list;
    }
}
