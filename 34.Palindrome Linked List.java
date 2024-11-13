class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int rev=0;
        int n=1;
        int sum =0;
        while(temp!=null)
        {
            sum=sum*10+temp.val;
           rev=rev+temp.val*n;
           n=n*10;
           temp=temp.next;
        }
        
       return sum==rev;
        
        
    }
}