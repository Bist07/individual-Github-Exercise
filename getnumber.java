import java.util.Scanner;

public class getnumber {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        reader.close();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
      
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

}
