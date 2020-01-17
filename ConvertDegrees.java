/**
Converts the degrees from Fahrenheit to Celsius.
Author: Daniel Oszczapinski	
Homework 2: Programming project 1
Completed: September 26, 2016
*/
import java.util.Scanner;


public class ConvertDegrees
{
	public static void main(String[] args)
	{
		System.out.println("Enter a degree in Fahrenheit as a whole number.");
		
		int DegreeF; 
		double DegreesC;
		
		Scanner keyboard = new Scanner(System.in);
		DegreeF = keyboard.nextInt();
		
		DegreesC = 5 * (DegreeF - 32) / 9;
		
		
		
		System.out.printf( "%2d degrees Fahrenheit is%5.1f degrees Celsius.", DegreeF, DegreesC);
	}
}