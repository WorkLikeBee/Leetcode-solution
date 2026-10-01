class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currObj;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        currObj = head;
        ListNode prevObj;
        prevObj = dummyHead;
        int numberOfNodes = 0;

        // Find the number of Nodes
    
        while(currObj!=null){
            numberOfNodes +=1;
            currObj = currObj.next;
        }

        // Bring currObj back to head again and traverse with numberOfNodes decreasing.

        currObj = head;
        while(currObj!=null){
            // When the numberOfNodes matches n then change the reference of the prevObj's next Obj to currObj.next (skip the currObj).
            if(numberOfNodes == n){
                prevObj.next = currObj.next;
            }
            numberOfNodes--;
            prevObj = currObj;
            currObj = currObj.next;
        }
        return dummyHead.next;
    }
}
