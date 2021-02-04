class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null,current=head,next=current.next;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public ListNode get_last(ListNode head)
    {
        while(head.next!=null)
            head=head.next;
        return head;
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count=1;
        ListNode temp=head;
        ListNode first_starting=head;
        while(count!=m)
        {
            first_starting=temp;
            count++;
            temp=temp.next;
        }
        ListNode first=temp;
        while(count!=n)
        {
            count++;
            temp=temp.next;
        }
        ListNode last=temp.next;
        temp.next=null;
        ListNode headd=reverse(first);
        if(m==1)
        {
            ListNode lastt=get_last(headd);
            lastt.next=last;
            return headd;
        }
        first_starting.next=headd;
        first.next=last;
        return head;
    }
}
