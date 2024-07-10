package 算法.杨辉三角形;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/18 22:47
 */
public class T {

    public static void main(String[] args) {
        ListNode l4 = new ListNode(4, null);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        List l = new List(l1);

        ListNode first = reverseList(l1);
        while (first.next != null) {
            System.out.println(first.val);
            first = first.next;
        }

    }

    public static ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head = null;

        return last;

    }



        static class List{
            ListNode head;

            List(ListNode head){
                this.head = head;
            }
            public void addFirst(ListNode first){
                first.next = head;
                head = first;
            }

            public ListNode removeFirst(){
                ListNode first = head;

                if(first != null){
                    head = first.next;
                }

                return first;
            }
        }



     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

}
