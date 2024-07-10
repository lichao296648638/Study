package 算法.链表;

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode s = new ListNode(-1, null);
        ListNode p = s;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1 == null){
            p.next = list2;
        }

        if(list2 == null){
            p.next = list1;
        }
        return s.next;
    }

    public static void main(String[] args) {
        ListNode node2 = new ListNode(2, null);
        ListNode node3 = new ListNode(3, null);

        ListNode node5 = new ListNode(5, null);
        ListNode node6 = new ListNode(6, null);

        node2.next = node3;

        node5.next = node6;

        ListNode list1 = new ListNode(1, node2);
        ListNode list2 = new ListNode(4, node5);

        mergeTwoLists(list1, list2);

    }
}