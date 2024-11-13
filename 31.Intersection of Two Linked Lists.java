public class Solution {
    static int size(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    };
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int n=size(headA);
        int m=size(headB);
        if(n>m)
        {
            for(int i=1;i<=n-m;i++)
            {
                temp1=temp1.next;
            }
        }
        else
        {
            for(int i=1;i<=m-n;i++)
            {
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;

        
    }
}
