import java.util.Scanner;
    public class Even_Odd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //Input a number.
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            //Check the number is even or odd.
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }

            //Close Scanner To Prevent Memory Loss.
            sc.close();
        }
    }
