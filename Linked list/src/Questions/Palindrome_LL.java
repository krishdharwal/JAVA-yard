package Questions;
// reverse from mid then check and then re reverse the list

public class Palindrome_LL {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

            list.add(1);
            list.add(2);
//            list.add(3);
            list.add(2);
            list.add(1);

            list.display();
           Boolean ans =  list.isPalindromeLL();
        System.out.println(ans);
    }
}
