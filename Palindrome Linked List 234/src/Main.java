public class Main {
    public static void main(String[] args) {
        Solution sol = new NotMySolution();
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode node2 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1, new ListNode(0, new ListNode(1)));
        ListNode node5 = new ListNode(1, new ListNode(2,
                new ListNode(2, new ListNode(3,
                        new ListNode(3, new ListNode(2,
                                new ListNode(2, new ListNode(1))))))));


        System.out.println(sol.isPalindrome(node));
        System.out.println(sol.isPalindrome(node2));
        System.out.println(sol.isPalindrome(node3));
        System.out.println(sol.isPalindrome(node4));
        System.out.println(sol.isPalindrome(node5));
    }
}