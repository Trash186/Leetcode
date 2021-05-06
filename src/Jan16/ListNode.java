package Jan16;

/**
 * @author Baller_Xiao
 * @Description
 * 翻转链表
 * @create_time 2021-01-16 17:03
 * @return
 * @Version
 */
public class ListNode
{
   public  int val;
    public ListNode next;
    public ListNode(int x)
    {
        val=x;
    }


}
class leetcode206
{
    public static ListNode reverList(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        ListNode next=null;
        ListNode reverList=null;
        while(head!=null)
        {
            next=head.next;
            head.next=reverList;
            reverList=head;
            head=next;
        }
        return reverList;
    }


}
