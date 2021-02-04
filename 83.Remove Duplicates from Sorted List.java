class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        HashSet<Integer> h=new HashSet<>();
        h.add(head.val);
        ListNode temp=head;
        ListNode tmp=head.next;
        while(temp!=null)
        {
            if(tmp!=null && !(h.contains(tmp.val)))
            {
                h.add(tmp.val);
                temp.next=tmp;
                tmp=tmp.next;
                temp=temp.next;
            }
            else if(tmp==null)
            {
                temp.next=null;
                break;
            }
            else
                tmp=tmp.next;
        }
        return head;
    }
}
