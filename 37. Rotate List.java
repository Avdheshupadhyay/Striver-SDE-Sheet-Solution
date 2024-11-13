class Solution {
    public ListNode rotateRight(ListNode head, int k) {
           if( k == 0 || head ==null || head.next == null) 
           return head;

        int len=1;
        ListNode cur=head;
        
        while(cur.next != null){
            len++;
            cur=cur.next;
        }
        k = len - (k%len);
        
        cur.next = head;

        for(int i=1;i<=k;i++){
            cur=cur.next;
         
        } 
     
        head = cur.next;
        cur.next = null;

        return head;
        
    }
}