package Level_1_Task_01;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit  ( C for celsius, F for Fahrenheit ): ");
        char unit = scanner.next().charAt(0);

        if (unit == 'C' || unit == 'c'){

            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println(temperature + " Celsius is = " + fahrenheit + " Fahrenheit.");
        } else if (unit == 'F' || unit == 'f') {

            double celsius = (temperature - 32) * 5/9;
            System.out.println(temperature + " Fahrenheit is = " + celsius + " Celsius.");
        }else {

            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }
    }

}
