package bodenseeCodeAcademy;

import java.util.Arrays;
import java.util.Scanner;


public class MainWeek9
{
	private static Scanner scanner = new Scanner( System.in );

	public static void main(String[] args)
	{
		//		arrayTheme();
		//		calculateAveragePrice();
		calculateAveragePriceOfLast3Years();
	}

	private static void arrayTheme()
	{
		double jahr1 = 100.00;
		// 2. Alternative
		//		double jahr1;
		//		jahr1 = 100.00;

		double jahr2 = 110.00;
		double jahr3 = 121.00;

		System.out.println( "jahr1 = " + jahr1 );
		System.out.println( "jahr2 = " + jahr2 );
		System.out.println( "jahr3 = " + jahr3 );

		// shortcut: Shift + F10 = run code
		double[] years;
		System.out.print( "Bitte schreiben sie das Volumen von Jahren: " );
		int volumeOfYears = scanner.nextInt();
		years = new double[volumeOfYears]; // initialisation
		// the sequence is not important
		years[1] = 110.00;
		years[2] = 121.00;
		years[0] = 100; // auto-boxing / auto-unboxing
		//		years[4] = 200.0; --> ArrayIndexOutOfBoundsException
		// default values: int=0, double=0.0, boolean=false, String=null
		System.out.println( "years = " + Arrays.toString( years ) );

		double[] guthaben = { 100.00, 110.00, 121.00 };
		System.out.println( "guthaben = " + Arrays.toString( guthaben ) );

	}

	private static void calculateAveragePrice()
	{
		//   0,  1,  2,  3,  4
		double[] prices = { 10, 20, 15, 40, 60 };
		double sum = 0;

		//		for( int i = 0; i < prices.length; i++ ) // prices.length = 5
		for( double price : prices ) // forEach
		{
			sum += price;
			//			sum += prices[i]; // sum = sum + prices[i];
			// prices[0]= 10,  sum= 10
			// prices[1]= 20,  sum= 30
			// prices[2]= 15,  sum= 45
			// prices[3]= 40,  sum= 105
			// prices[4]= 60,  sum= 165
			//  prices[5] --> ArrayIndexOutOfBoundsException
		}
		// Garbage Collector deletes i
		double average = sum / prices.length;
		System.out.println( "average = " + average );

	}

	// 2-Dimension Arrays
	private static void calculateAveragePriceOfLast3Years()
	{
		// prices of 3 years
		double[][] prices = { //
			{ 10, 20, 15, 40, 60 }, // year1
			{ 70, 20, 35, 45, 50 }, // year2
			{ 80, 20, 55, 20, 20 }  // year3
		};
		double sum = 0;
		int numberOfPrices = 0;

		// 1. Alternative
		//		for( int row = 0; row < prices.length; row++ )
		//		{
		//			for( int column = 0; column < prices[row].length; column++ )
		//			{
		//				sum += prices[row][column];
		//				//	System.out.println( "prices[0][0] = " + prices[0][0] );  --> 10
		//				//	System.out.println( "prices[0][4] = " + prices[0][4] );  --> 60
		//			}
		//			numberOfPrices += prices[row].length;
		//		}

		// 2. Alternative: forEach loop
		for( double[] pricesInRow : prices )
		{
			for( double price : pricesInRow )
			{
				sum += price;
			}
			numberOfPrices += pricesInRow.length;
		}

		double averageOf3Years = sum / numberOfPrices;
		System.out.println( "averageOf3Years = " + averageOf3Years );
	}

}
