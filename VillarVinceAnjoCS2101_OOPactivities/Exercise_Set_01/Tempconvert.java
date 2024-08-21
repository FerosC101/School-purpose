import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        
        String measure = "";
        while (!measure.equalsIgnoreCase("C") && !measure.equalsIgnoreCase("F")) {
            System.out.print("Enter C for Celsius to Fahrenheit and Enter F for Fahrenheit to Celsius: ");
            measure = scanner.nextLine();
    
            if (!measure.equalsIgnoreCase("C") && !measure.equalsIgnoreCase("F")) {
                System.out.println("Invalid input. Please enter 'C' or 'F'.");
            }
        }
        
    
        System.out.print("Enter the temperature you wish to convert: ");
        float temperature = scanner.nextFloat();
    
        if (measure.equalsIgnoreCase("C")) {
            float result =  (temperature * 9/5) + 32;
            System.out.printf("%.2f Celcius is %.2f Farenheit", temperature, result);
        } else if (measure.equalsIgnoreCase("F")) {
            float result = (temperature - 32) * 5/9;
            System.out.printf("%.2f Farenheit is %.2f Celcius", temperature, result, measure);
        } 
    
        scanner.close();
    }
}
