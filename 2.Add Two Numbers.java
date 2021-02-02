class Solution {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2)
    {
        ListNode head=new ListNode(0);
        ListNode temp=head;
        int carry=0;
        while(head1!=null && head2!=null)
        {
            int a=head1.val+head2.val+carry;
            if(a>9)
            {
                carry=1;
                a=a%10;
            }
            else
                carry=0;
            ListNode new_node=new ListNode(a);
            temp.next=new_node;
            temp=temp.next;
            head1=head1.next;
            head2=head2.next;
        }
        if(head1==null && head2!=null)
        {
          while(head2!=null)
          {
                int a=head2.val+carry;
            if(a>9)
            {
                carry=1;
                a=a%10;
            }
            else
                carry=0;
            ListNode new_node=new ListNode(a);
            temp.next=new_node;
            temp=temp.next;
            head2=head2.next;
           }
        }
        if(head1!=null && head2==null)
        {
          while(head1!=null)
          {
                int a=head1.val+carry;
            if(a>9)
            {
                carry=1;
                a=a%10;
            }
            else
                carry=0;
            ListNode new_node=new ListNode(a);
            temp.next=new_node;
            temp=temp.next;
            head1=head1.next;
           }
        }
        if(carry==1)
        {
          ListNode new_node=new ListNode(1);
            temp.next=new_node;  
        }
        return head.next;
    }
}
