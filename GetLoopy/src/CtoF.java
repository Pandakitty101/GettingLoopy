import java.util.Scanner;

public class CtoF {
    public static void main(String[] args)
    {
        double celsius = 0;
        double fahrenheit = 0;
        final double CELSIUS_TO_FAHRENHEIT = 1.8;
        final int CELSIUS_TO_FAHRENHEIT_TWO = 32;
        String trash;
        boolean invalid;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("What is the temperature in celsius?");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                invalid = false;
                fahrenheit = (celsius * CELSIUS_TO_FAHRENHEIT) + CELSIUS_TO_FAHRENHEIT_TWO;
                System.out.println(celsius + " degrees celsius converted to fahrenheit is " + fahrenheit + " degrees fahrenheit");
            }
            else
            {
                trash = in.nextLine();
                invalid = true;
                System.out.println("Enter a valid degree in celsius: " + trash);
            }
        }while (invalid);

    }
}
