class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.next!=null)
            {
                int tmp=temp.next.val;
                temp.next.val=temp.val;
                temp.val=tmp;
            }
            if(temp.next==null)
                break;
            temp=temp.next.next;
        }
        return head;
    }
}
