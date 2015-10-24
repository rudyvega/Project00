package proj0;

import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		
			Scanner inputSource = new Scanner(System.in);
			String input1, input2  ; // Changed type to String to enable parse methods 
			Double result;
			double d1=0, d2=0;// variables to take input values
			int i1=0, i2=0;
			System.out.print("Please enter two numbers of your exalted choosing: ");
			input1 = inputSource.next();//get first value from user
			
		try {
			 i1 = Integer.parseInt(input1);// check string and see if value is an integer and convert if so...
			 								//
		}
			catch(NumberFormatException name)//... if not this handles the exception thrown by alternate value
		{
			 d1 = Double.parseDouble(input1);// checks string for double value and converts if so
				
		}
		
		input2 = inputSource.next();//get 2nd value
			
		try {
			 i2 = Integer.parseInt(input2);
		}
			catch(NumberFormatException name)
		{
			 d2 = Double.parseDouble(input2);
				
		}
			result = i1 + i2 + d1 + d2 ; // add all values

			int resultDiv= result.intValue(); // create real # version of result 
			if (result-resultDiv !=0) 			// check difference and
			{	System.out.println(result);		//print result if it is an integer

			}
			else								// ELSE prints a double value
				
				System.out.println(resultDiv );

			inputSource.close();				//close scanner			
	}
	}



    


