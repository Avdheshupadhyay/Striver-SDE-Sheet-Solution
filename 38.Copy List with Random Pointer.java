class Solution {
    public Node copyRandomList(Node head) {
         HashMap<Node,Node>map=new HashMap<>();

        Node newHead=null;
        Node nTemp=null;
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.val);
            map.put(temp,newNode);
            if(newHead==null){
                newHead=newNode;
                nTemp=newHead;
            }else{
                nTemp.next=newNode;
                nTemp=newNode;
            }

            temp=temp.next;
        }

        temp=head;
        nTemp=newHead;
        while(temp!=null){
            if(temp.random!=null){
                nTemp.random=map.get(temp.random);               
            }
            temp=temp.next;
            nTemp=nTemp.next;
        }

        return newHead;
    }
}