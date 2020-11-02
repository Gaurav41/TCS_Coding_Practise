/*
A customer has a choice to buy TV from set of 3 company models provided by store.
If customer take an exchange offer.

    Then customer get discount of 2% is old TV is not in working condition
    Customer gets discount of 20% if old TV is in working condition

If customer do not opt for exchange offer then, he has to pay MRP of TV as amount

Display the amount of customer has to pay.

Menu for TV condition should be displayed only if customer choose for exchange offer

When user enters invalid option then code should stop with message “INVALID INPUT”, 
it should be displayed in same format as it is case sensitive.
Make sure output text should be in exact format mentioned above

Assume following List is already seen by customer, There should be 3 inputs for each 
question whose answer should be a number given with that choice.

First input choice

Display List (Select TV Model)

    Samsung 10000
    Onida 7000
    HDLC 6000

Second Input Choice

Want to take Exchange Offer

    Yes
    No

Third Input Choice

Current Condition of customer’s old TV

    Working
    Not Working

For example, if customer want TV HDLC and he want to opt exchange offer for his old TV 
which is in working condition then output will be 4800.0 INR

All input values should be entered in Following Format

3

1

1

Output 4800.0 INR

Note that when customer do not opt for exchange offer, there will be only 2 inputs.
 */
package NQTCodingQuestions_2020;

import java.util.Scanner;

public class TV {
	public void fun(double price)
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			a=sc.nextInt();
			switch(a)
			{
			case 1:
				price=price-(price*0.20);
				break;
			case 2:
				price=price-(price*0.20);
				break;
			default: System.out.println("INVALID IP");
			}
			
			break;
		case 2:
			break;
			default: System.out.println("INVALID IP");
		}
		System.out.println(price+" INR");
	}

	public static void main(String[] args) {
		TV tv= new TV();
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			tv.fun(10000);
			break;
		case 2:
			tv.fun(7000);
			break;
			
		case 3:
			tv.fun(6000);
			break;
		default: System.out.println("INVALID IP");
		}
		
	}

}
/*

Question 1 : A customer has a choice to buy TV from set of 3 company models provided by store.
If customer take an exchange offer.

    Then customer get discount of 2% is old TV is not in working condition
    Customer gets discount of 20% if old TV is in working condition

If customer do not opt for exchange offer then, he has to pay MRP of TV as amount

Display the amount of customer has to pay.

Menu for TV condition should be displayed only if customer choose for exchange offer

When user enters invalid option then code should stop with message “INVALID INPUT”, it should be displayed in same format as it is case sensitive.
Make sure output text should be in exact format mentioned above

Assume following List is already seen by customer, There should be 3 inputs for each question whose answer should be a number given with that choice.

First input choice

Display List (Select TV Model)

    Samsung 10000
    Onida 7000
    HDLC 6000

Second Input Choice

Want to take Exchange Offer

    Yes
    No

Third Input Choice

Current Condition of customer’s old TV

    Working
    Not Working

For example, if customer want TV HDLC and he want to opt exchange offer for his old TV which is in working condition then output will be 4800.0 INR

All input values should be entered in Following Format

3

1

1

Output 4800.0 INR

Note that when customer do not opt for exchange offer, there will be only 2 inputs.
*/