import java.util.Scanner;
public class forLoopDemo {
    Scanner in = new Scanner(System.in);
    public void loop1()
    {
        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }
    public void loop2(){
        int sum = 0;
        int n = 1000;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
    public void loop3(){
        String original, reverse = ""; // Objects of String class
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        }else
        {
            System.out.println("Entered string/number isn't a palindrome.");
        }
    }
    public void loop4(){
        for(int i=1;i<=5;i++) {
            //System.out.print(i+" ");
            for (int j = 1; j <= i; j++) {
                //System.out.print(j+" ");
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
