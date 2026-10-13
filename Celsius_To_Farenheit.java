import java.util.Scanner;

public class Celsius_To_Farenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int celsius = sc.nextInt();

        double fahrenheit = ((double) celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        //close scanner to prevent mempry loss.
        sc.close();
    }
}