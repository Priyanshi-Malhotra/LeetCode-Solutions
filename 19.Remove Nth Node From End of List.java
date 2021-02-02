class Solution {
    public int length(ListNode head)
    {
      if(head==null)
          return 0;
        return 1+length(head.next);
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (length(head)==1 && n==1))
            return null;
        if(n>length(head))
            return head;
        if(length(head)==n)
        {
            head=head.next;
            return head;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            if(length(temp.next)==n)
            {
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
 }
 }
