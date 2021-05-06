package Jan16;

/**
 * @author Baller_Xiao
 * @Description
 * 回文链表
 * 先用双指针找到中间节点，然后把中间后面的部分反转
 * 将快节点指向头部，遍历两个链表，比较是否有不同元素，若有，直接退出
 * @create_time 2021-01-17 1:22
 * @return
 * @Version
 */
public class leetcode234
{
  public static boolean isPalindrome(ListNode head)
  {
      ListNode fast=head;
      ListNode slow=head;

      while(fast!=null && fast.next!=null)
      {
          fast=fast.next.next;
          slow=slow.next;
      }
      slow=reverse(slow);
      fast=head;
      while(slow!=null)
      {
          if(slow.val!=fast.val)
          {
              return false;
          }
          slow=slow.next;
          fast=fast.next;
      }
      return true;
  }
  public static ListNode reverse(ListNode node)
  {
      ListNode newList=null;
      ListNode next=null;
      while(node!=null)
      {
          next=node.next;
          node.next=newList;
          newList=node;
          node=next;
      }
      return newList;
  }

    public static void main(String[] args)
    {

    }
}
