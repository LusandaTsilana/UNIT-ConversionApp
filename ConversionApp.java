/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionapp;
import java.util.*;

/**
 *
 * @author Lusanda.Tsilana
 */
public class ConversionApp {

    /**
     * @param args the command line arguments
     */
    
    
    static double 
        FeetToMeters(double n1)
    {
        return n1 * 0.305;
    }
    static double
            MetersToFeet(double n1)
    {
        return n1 * 3.28;
    }
    static double
            PoundsToKilograms(double n1)
    {
        return n1 * 0.454;
    }
    static double 
        KilogramsToPounds(double n1)
    {
        return n1 * 2.205;
    }
    static double
            FahrenheitToCelsius(double n1)
    {
        return (n1 - 32) / 1.8;
    }
    static double
            CelsiusToFahrenheit(double n1)
    {
        return n1 * 1.8 + 32;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner (System.in);
        
        System.out.println("Provide the unit you want to convert from:");
        String firstInput = input.next();
        
        
        System.out.println("Provide the unit you want to convert to:");
        
        String SecondInput = input.next();
        
        System.out.println("Provide the quantity amount:");
        
        double quantity  = input.nextDouble();
      
        if(firstInput.equalsIgnoreCase("Feet") && SecondInput.equalsIgnoreCase("Meters"))
        {
            double meters = FeetToMeters(quantity);
            System.out.println("conversion of feet to meters: " + meters + "meters");
            
        }
        
        else if(firstInput.equalsIgnoreCase("Meters") && SecondInput.equalsIgnoreCase("Feet"))
        {
            double feet = MetersToFeet(quantity);
            System.out.println("Conversion of meters to feet:" + feet + "feet");
        }
        
        else if(firstInput.equalsIgnoreCase("Pounds") && SecondInput.equalsIgnoreCase("Kilograms"))
        {
            double kilograms = PoundsToKilograms(quantity);
            System.out.println("Conversion of pounds to kilograms:" + kilograms + "kg");
        }
        
        else if(firstInput.equalsIgnoreCase("Kilograms") && SecondInput.equalsIgnoreCase("Pounds"))
        {
            double pounds = KilogramsToPounds(quantity);
            System.out.println("conversion of kilograms to pounds: " + pounds + "lb");
            
        }
        
        else if(firstInput.equalsIgnoreCase("Fahrenheit") && SecondInput.equalsIgnoreCase("Celsius"))
        {
            double celsius = FahrenheitToCelsius(quantity);
            System.out.println("Conversion of fahrenheit to celsius:" + celsius + "C");
        }
        
        else if(firstInput.equalsIgnoreCase("Celsius") && SecondInput.equalsIgnoreCase("Fahrenheit"))
        {
            double fahrenheit = CelsiusToFahrenheit(quantity);
            System.out.println("Conversion of celsius to fahrenheit:" + fahrenheit + "F");
        }
       
    }
    
}
