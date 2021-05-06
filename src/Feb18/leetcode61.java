package Feb18;

import Jan16.ListNode;

/**
 * @author Baller_Xiao
 * @Description旋转链表
 * 使用环形链表
 * @create_time 2021-02-19 0:42
 * @return
 * @Version
 */
public class leetcode61
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode cur=head;
        int length=1;
        while(cur.next!=null)
        {
            cur=cur.next;
            length++;
        }
        ListNode tail=cur;
        tail.next=head;
        k=k%length;
        for(int i=0;i<length-k;i++)
        {
            tail=tail.next;
        }
        head=tail.next;
        tail.next=null;
        return head;
    }
}
