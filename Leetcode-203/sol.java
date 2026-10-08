class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        ListNode currObj;
        ListNode previous;
        dummyHead.next = head;
        previous = dummyHead;
        currObj = head;
        while(currObj != null){
            if (currObj.val == val){
                previous.next = currObj.next;
            }
            else{
                previous = currObj;
            }
            currObj = currObj.next;
        }
        return dummyHead.next;
    }
}
