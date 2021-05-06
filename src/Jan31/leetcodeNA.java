package Jan31;

import Jan16.ListNode;

/**
 * @author Baller_Xiao
 * @Description
 * 链表倒数第n个节点 输出值即可
 * 先遍历一遍，发觉有多少个节点
 * 然后正向遍历
 * @create_time 2021-02-01 0:27
 * @return
 * @Version
 */
public class leetcodeNA
{
    public int kthToLast(ListNode head, int k)
    {
        if(head==null)
        {
            return 0;
        }
        int count=1;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<count-k;i++)
        {
            temp=temp.next;
        }
        return temp.val;

    }
}
