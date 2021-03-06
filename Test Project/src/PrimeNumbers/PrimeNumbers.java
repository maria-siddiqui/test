package PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in); //creating scanner class object
	System.out.println("Enter the first number");
	int first=input.nextInt();//taking input from user for first number of the range to be checked
	System.out.println("Enter the last number");
	int last=input.nextInt();//taking input from user for last number of the range to be checked
	if (first > last) {
        System.out.println("Your first num should be less than second");
    }
	System.out.println("Prime numbers between "+first+" and "+last);
	
	for (int j=first;j<=last;j++){//using loop to check all the numbers in given range
		int num=j; //putting each number of range in num variable
		boolean isPrime=true;
		if (num<=1){  
			isPrime=false; //because 0 and 1 are not prime numbers
			}
		if (num>=2){ //checking num greater than 1 
			for(int i=2;i<=num/2;i++){ //dividing num by all other numbers half of it to check divisibility
				if (num%i==0){  //checking remainders
					isPrime=false; //if remainder is zero then num is divisible and is not a prime number
					break; //if above condition becomes true then loop should stop
					}
				else {  
					isPrime=true; //else remainder is not zero so num is a prime number
				}
			}
			if (isPrime==true){
				System.out.println(num); //prints prime numbers in given range
				}
			}
		}
	input.close();
	}
}


