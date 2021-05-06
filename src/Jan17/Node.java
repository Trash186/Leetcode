package Jan17;

import java.util.List;

/**
 * @author Baller_Xiao
 * @Description
 * @create_time 2021-01-17 18:55
 * @return
 * @Version
 */
public class Node
{
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
