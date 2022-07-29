import java.util.ArrayList;
import java.util.List;

class MySolution implements Solution {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        List<ListNode> arr = new ArrayList<>();
        parseRecursion(head, arr);
        for (int i = 0, j = arr.size() - 1; i < arr.size() / 2; i++, j--) {
            if (arr.get(i).val != arr.get(j).val) {
                return false;
            }
        }
        return true;
    }

    private void parseRecursion(ListNode head, List<ListNode> arr) {
        if (head.next != null) {
            parseRecursion(head.next, arr);
        }
        arr.add(head);
    }
}