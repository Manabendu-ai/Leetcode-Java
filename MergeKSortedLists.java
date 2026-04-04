class ListNode{
    int val; 
    ListNode next;
    ListNode(){}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class MergeKSortedLists {
    
    public ListNode merge(ListNode[] lists){
        if(lists == null || lists.length == 0){
            return null;
        }
        return helper(lists, 0, lists.length-1);
    }

    public ListNode helper(ListNode[] lists, int start, int end){
        if(start == end){
            return lists[start];
        }
        if(start == end-1){
            return mergeTwoLists(lists[start], lists[end]);
        }
        int mid = (start + end)/2;
        ListNode left = helper(lists, start, mid);
        ListNode right = helper(lists, mid+1, end);
        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode left, ListNode right){
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(left != null && right != null){
            if(left.val < right.val){
                curr.next = left;
                left = left.next;
            }
            else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }

        curr.next = (left != null) ? left : right;
        return dummy.next;

    }
    // Time Complexity : O(N logK)
}
