import java.util.*;

class Week4 {
  // Method that calulates the sum of digits of a number and return the sum
  public static int sumDigits(long num) {
    if (num < 0) {
      num = Math.abs(num);
      System.out.println("Converting negative number to the absolute value");
    }
    // Find digits
    final int BASE = 10;
    int digit = 0;
    int sum = 0;
    while (num > 0) {
      digit = (int)(num % BASE);
      sum += digit;
      num = num / BASE;
    }
    return sum;
  }

	/*
	Problem: Write a Java program that calculates the sum of all even numbers
	between 1 and 100. Use a for loop to iterate through the numbers and
	accumulate the sum of the even ones.
	/*/
	public static void LoopProblem1() {
		int sum = 0;
		for (int i =0; i < 100; i+= 2) {
			sum+= i;
		}
		System.out.println("[LoopProblem1] Sum of all even numbers between (1,100) is " + Integer.toString(sum));
	}

	/*
	Problem: Write a Java program that calculates the factorial of a given number.
	The number is provided by the user as input.
	Use a while loop to multiply the numbers from the given number down to 1.
	*/
	public static void LoopProblem2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[LoopProblem2] Enter a number whose factorial is needed ");
		int num = sc.nextInt();

		// validate number
		if (num <= 0) {
			System.out.println("[LoopProblem2] Invalid number entered.");
			return;
		}

		int factorial = 1;
		while(num > 0) {
			factorial *= num;
			num--;
		}
		System.out.println("[LoopProblem2] The factorial is: " + Integer.toString(factorial));
	}

	/*
	Problem: Write a simple number guessing game where the user has to guess a
	number between 1 and 10. The program keeps asking for guesses until the user
	guesses the correct number. Each time the user makes an incorrect guess, the
	program gives a hint to the user about whether the number they guessed was lower or higher
	than the correct number. Use a do-while loop to ensure the user is prompted at least once.

	You can create a variable in your program with the number the user is supposed to guess.
	*/
	public static void LoopProblem3() {
		Scanner sc = new Scanner(System.in);
		final int actual = 7;
		int num = 0;
		System.out.println("[LoopProblem3] Guess the number between 1 to 10 that I have in my mind");
		do {
			num = sc.nextInt();
			if (num < actual) {
				System.out.println("[LoopProblem3] The guess was lower than actual number. Try again");
			} else if (num > actual) {
				System.out.println("[LoopProblem3] The guess was higher than actual number. Try again");
			} else {
				System.out.println("[LoopProblem3] You guessed right!");
			}

		} while(num != actual);
	}

	public static void Assignment7() {
		System.out.println("*******************LoopProblem1*****************************");
		LoopProblem1();
		System.out.println("*******************LoopProblem2*****************************");
		LoopProblem2();
		System.out.println("*******************LoopProblem3*****************************");
		LoopProblem3();
	}

  public static void Assignment6() {
    // Test for zero 
    System.out.println("[TEST]Sum of the digits in the number 0 is: " + sumDigits(0));

    // Test for negetive 
    System.out.println("[TEST]Sum of the digits in the number -123 is: " + sumDigits(-123));

    // Test for max value of long         
    System.out.println("[TEST]Sum of the digits in the number MAX_VALUE is: " + sumDigits(Long.MAX_VALUE));

    // Test for user input
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();

    System.out.println("Sum of the digits in the user-input number " + Long.toString(num) + " is: " + sumDigits(num));
  }

  public static void main(String[] args) {
	System.out.println("*******************Assignment6*****************************");
	Assignment6();
	System.out.println("*******************Assignment7*****************************");
	Assignment7();
  }
}