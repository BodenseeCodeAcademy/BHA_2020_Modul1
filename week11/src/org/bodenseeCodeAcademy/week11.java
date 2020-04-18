package org.bodenseeCodeAcademy;

import java.util.Arrays;


public class week11
{

	public static void main(String[] args)
	{
		// Arrays, Classes... 			-->  Reference Types
		// boolean, int, long, String...-->  Value Types

		int value1 = 10;
		int value2 = value1;

		System.out.println( "value1= " + value1 );
		System.out.println( "value2= " + value2 );

		value2 = 20;

		System.out.println( "value1= " + value1 );
		System.out.println( "value2= " + value2 );
		System.out.println( "----" );

		// Arrays mit Reference Type
		int[] valueArray3 = { 0, 0, 0 };
		int[] valueArray1 = new int[3];
		int[] valueArray2 = valueArray1;
		valueArray3 = valueArray2;
		System.out.println( "valueArray1 : " + Arrays.toString( valueArray1 ) );
		System.out.println( "valueArray2 : " + Arrays.toString( valueArray2 ) );

		valueArray1[0] = 1;
		valueArray2[1] = 2;
		valueArray2[2] = 2;

		System.out.println( "valueArray1 : " + Arrays.toString( valueArray1 ) );
		System.out.println( "valueArray2 : " + Arrays.toString( valueArray2 ) );

		valueArray1 = new int[] { 11, 12, 13 };
		modifyArray( valueArray2 );
		System.out.println( "----" );
		System.out.println( "valueArray1 : " + Arrays.toString( valueArray1 ) );
		System.out.println( "valueArray2 : " + Arrays.toString( valueArray2 ) );
		System.out.println( "valueArray3 : " + Arrays.toString( valueArray3 ) );

		findMinValueInArray( valueArray2 );
	}

	private static void findMinValueInArray(int[] arrayAsParameter)
	{
		int[] arrayInMethod = arrayAsParameter;
		int minimalValue = Integer.MAX_VALUE;

		for( int i = 0; i < arrayInMethod.length; i++ )
		{
			if( arrayInMethod[i] < minimalValue )
			{
				minimalValue = arrayInMethod[i];
			}
		}
		System.out.println( "minimalValue in array --> " + minimalValue );
	}

	private static void modifyArray(int[] arrayAsParameter)
	{
		arrayAsParameter[0] = 5;
		arrayAsParameter[1] = 7;
		arrayAsParameter[2] = 9;
	}

}
