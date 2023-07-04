import java.util.Scanner;
public class Main{

    // Celcius
    // Conversion Celcius to Fahrenheit
    private static double celciustoFahrenheit(double valueCelcius){
        return (valueCelcius * 9/5) + 32;
    }

    // Celcius ke Kelvin
    private static double celciusToKelvin(double valueCelcius){
        return valueCelcius + 273.15;
    }

    // celcius ke reamur
    private static double celciusToReamur(double valueCelcius){
        return valueCelcius * 4/5;
    }

    // Fahrenheit
    // Conversion Fahrenheit to Celcius
    private static double fahrenheitToCelcius(double valueFahrenheit){
        return (valueFahrenheit - 32) * 5 / 9;
    }

    // Fahrenheit ke skala Reamur  => T (derajat R) = 4/9 T derajat F – 32
    private static double fahrenheitToReamur(double valueFahrenheit){
        return (valueFahrenheit - 32) * 4/9;
    }

    // Fahrenheit ke Kelvin => T (K) = 5/9 ( T derajat F – 32) + 273
    private static double fahrenheitToKelvin(double valueFahrenheit){
        return (valueFahrenheit + 459.67) * 5/9;
    }

    // Reamur
    // Reamur ke Celcius => T (derajat C) = 5/4 T derajat R
    private static double reamurToCelcius(double valueReamur){
        return valueReamur * 5/4 ;
    }

    // Reamur ke Fahrenheit => T (derajat F) = 9/4 T derajat F + 32
    private static double reamurToFahrenheit(double valueReamur){
        return valueReamur * 9/4 + 32;
    }

    // Reamur ke Kelvin => T (K) = 5/4 T derajat R + 273
    private static double reamurToKelvin(double valueReamur){
        return valueReamur * 5/4 + 273.15;
    }

    // Kelvin
    // Kelvin ke skala Celcius => T (derajat C) = TK – 273
    private static double kelvinToCelcius(double valueKelvin){
        return valueKelvin - 273.15;
    }

    // Kelvin ke skala Fahrenheit => T (derajat F) = 9/5 (TK-273) + 32
    private static double kelvinToFahrenheit(double valueKelvin){
        return valueKelvin *  9/5 - 459.67;
    }

    // Kelvin ke skala Reamur => T (derajat R) = 4/5 TK – 273
    private static double kelvinToReamur(double valueKelvin){
//        return (valueKelvin- 273.15) * 4/5;
        return (valueKelvin + (-273.15)) * 4/5;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan suhu: ");
        double suhuInputUser = scan.nextDouble();

        // Print
        System.out.println("\nIni Celcius");
        System.out.println("celcius ke fahrenheit = " + celciustoFahrenheit(suhuInputUser));
        System.out.println("celcius ke kelvin = " + celciusToKelvin(suhuInputUser));
        System.out.println("celcius ke reamur = " + celciusToReamur(suhuInputUser));
        System.out.print("\n");
        System.out.println("Ini Fahrenheit");
        System.out.println("fahrenheit ke celcius = " + fahrenheitToCelcius(suhuInputUser));
        System.out.println("fahrenheit ke kelvin = " + fahrenheitToKelvin(suhuInputUser));
        System.out.println("fahrenheit ke reamur = " + fahrenheitToReamur(suhuInputUser));
        System.out.print("\n");
        System.out.println("Ini Reamur");
        System.out.println("Reamur ke celcius = " + reamurToCelcius(suhuInputUser));
        System.out.println("reamur ke fahrenheit = " + reamurToFahrenheit(suhuInputUser));
        System.out.println("reamur ke kelvin = " + reamurToKelvin(suhuInputUser));
        System.out.print("\n");
        System.out.println("Ini Kelvin");
        System.out.println("Kelvin ke celcius = " + kelvinToCelcius(suhuInputUser));
        System.out.println("kelvin ke fahrenheit = " + kelvinToFahrenheit(suhuInputUser));
        System.out.println("kelvin ke reamur = " + kelvinToReamur(suhuInputUser));

    }

}
