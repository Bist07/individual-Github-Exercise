import java.util.Scanner;

public class getInt {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        System.out.println(num + " is odd");
    }
}