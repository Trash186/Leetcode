package Jan31;

import Jan16.ListNode;

/**
 * @author Baller_Xiao
 * @Description合并两个有序的链表
 * @create_time 2021-01-31 23:58
 * @return
 * @Version
 */
public class leetcode25
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode temp=new ListNode(0);
        ListNode cur=temp;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<l2.val)
            {
                cur.next=l1;
                l1=l1.next;
            }
            else
            {
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next=((l1==null)?l2:l1);
        return temp.next;

    }
}
