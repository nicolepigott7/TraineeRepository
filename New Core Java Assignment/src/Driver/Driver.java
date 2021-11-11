package Driver;

import java.util.Arrays;

import Questions.Q1;
import Questions.Q2;
import Questions.Q3;
import Questions.Q4;
import Questions.Q5;
import Questions.Q6;
import Questions.Q7;
import Questions.Q8;
import Questions.Q9;
import Questions.Q10;
import Questions.Q11;
import Questions.Q12;
import Questions.Q13;
import Questions.Q14;
import Questions.Q15;
import Questions.Q16;
import Questions.Q17;
import Questions.Q18_Subclass;
import Questions.Q19;
import Questions.Q20;

public class Driver {

	// Ellipsis is called var-args, and allows zero, one, or many of the same type of argument
	public static void main(String... args)
	{
		// Array initialization syntax (filled array)
		int[] myArray = { 19, 20, 1, 16, 7, 9 };

		// Array declaration syntax (empty array)
		int[] myOtherArray = new int[10];
		myOtherArray[0] = 19;
		myOtherArray[1] = 20;
		// myOtherArray[2] = ...

		int[] sortedArray = Q1.BubbleSort(myArray);
		System.out.println(Arrays.toString(sortedArray));
		
		Q2.main(args);
		
		Q3.TestReverse();
		
		Q4.Factorial(); 
		
		Q5.TestSubstring(4);
		
		Q6.isEven(0);
		
		Q7 q7 = new Q7();
		q7.Compare(); 
		
		Q8 q8 = new Q8();
		q8.Palindrome();
		
		Q9.main(args);
		
		Q10.main(args);
		
		Q11.main(args, args);
		
		Q12.DisplayEvenNumbers();
		
		Q13.PrintTriangle(4);
		
		Q14.SwitchCases(1);
		Q14.SwitchCases(2);
		Q14.SwitchCases(3);
		
		Q15 q15 = new Q15();
		q15.Interfaces();
		
		Q16.Count(args[0]);
		if (args.length > 0)
			System.out.println(args[0].length());
		
		Q17 q17 = new Q17();
		q17.CalculateInterest();
		
		Q18_Subclass q18 = new Q18_Subclass(); 
		System.out.println(q18.hasUppercaseLetter("Nickel"));
		System.out.println(q18.hasUppercaseLetter("nick"));
		System.out.println(q18.hasUppercaseLetter("the dog is in the room"));
		System.out.println(q18.hasUppercaseLetter("THE DOG IS IN THE ROOM"));
		
		System.out.println(q18.toUpperCase("the dog is down the street"));
		
		System.out.println(q18.stringToInt("Nickel")); 
						
		Q19 q19 = new Q19();
		q19.arrayListPrimes();

		Q20 q20 = new Q20();
		q20.loadData();
	
	}
	
			
			
		}
	
		
		
		
