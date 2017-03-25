/**
 * Created by suraj on 2/8/2017.
 */
public class PalindromeBy1Character {
    static void isPalindrome(String str){
        int front = 0, end = str.length() - 1;
        char[] chars = str.toCharArray();
        int numberOfChanges = 0;
        int mid = str.length()/2;
        while (((front < mid) && (end > mid) ) && (chars[front] == chars[end])){
            front++;
            end--;
        }
        if(front == mid && end == mid){
            System.out.println("Yes Palindrome");
            return;
        }


    }
}
