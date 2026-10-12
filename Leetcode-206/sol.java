class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currObj;
        ListNode prevObj = null;
        currObj = head;
        while(currObj != null){
            ListNode nextObj = currObj.next;
            currObj.next = prevObj;
            prevObj = currObj;
            currObj = nextObj;
        }
        head = prevObj;
        return head;
    }
}
