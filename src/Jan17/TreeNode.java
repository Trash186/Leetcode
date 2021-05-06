package Jan17;

/**
 * @author Baller_Xiao
 * @Description
 * @create_time 2021-01-17 22:53
 * @return
 * @Version
 */
public class TreeNode
{

      public int val;
      public TreeNode left;
      public TreeNode  right;
      public  TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
      }
}
