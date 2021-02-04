class Solution {
    public boolean repeated(ListNode head,int val)
    {
        int count=0;
        while(head!=null)
        {
            if(head.val==val)
                count++;
            if(count>=2)
                return true;
            head=head.next;
        }
        return false;
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode headd=new ListNode(0);
        ListNode temp=headd;
        ListNode tmp=head;
        while(temp!=null)
        {
            if(tmp!=null && !(repeated(head,tmp.val)))
            {
                temp.next=tmp;
                temp=temp.next;
                tmp=tmp.next;
            }
            else if(tmp==null)
            {
                temp.next=null;
                break;
            }
            else
                tmp=tmp.next;
        }
        return headd.next;
    }
}
