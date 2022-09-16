import java.util.Scanner;

public class getInt {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        System.out.println(num + " is odd");
<<<<<<< Updated upstream
    
=======

      
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
         
        if (num % i == 0) {
            flag = true;
            break;
            }
        }
          
    if (!flag)
        System.out.println(num + " is a prime number.");
    else
        System.out.println(num + " is not a prime number.");
    
    }
          
>>>>>>> Stashed changes
}