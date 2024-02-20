import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int rev = 0;
        int original = num;
        while (num != 0) {
            int d = num % 10;
            rev = rev *10+d;
            num /=10;
        }
        return original==rev;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = sc.nextInt();
    if(isPalindrome(num)){
        System.out.println(num+" palindrome");
    }else{
        System.out.println(num+" Not palindrome");
    }
}
}
