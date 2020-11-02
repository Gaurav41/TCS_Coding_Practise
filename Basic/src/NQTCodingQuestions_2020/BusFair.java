/*
A City Bus is a Ring Route Bus which runs in circular fashion.That is, Bus once starts at the Source 
Bus Stop, halts at each Bus Stop in its Route and at the end it reaches the Source Bus Stop again.
If there are n  number of Stops and if the bus starts at Bus Stop 1, then after nth Bus Stop, 
the next stop in the Route will be Bus Stop number 1 always.
If there are n stops, there will be n paths.One path connects two stops. Distances (in meters) 
for all paths in Ring Route is given in array Path[] as given below:
Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]
Fare is determined based on the distance covered from source to destination stop as  
Distance between Input Source and Destination Stops can be measured by looking at values in 
array Path[] and fare can be calculated as per following criteria:
    If d =1000 metres, then fare=5 INR
    (When calculating fare for others, the calculated fare containing any fraction value should be ceiled. 
    For example, for distance 900n when fare initially calculated is 4.5 which must be ceiled to 5)
Path is circular in function. Value at each index indicates distance till current stop from the 
previous one. And each index position can be mapped with values at same index in BusStops [] array, 
which is a string array holding abbreviation of names for all stops as-

�THANERAILWAYSTN� = �TH�, �GAONDEVI� = �GA�, �ICEFACTROY� = �IC�, �HARINIWASCIRCLE� = �HA�, 
�TEENHATHNAKA� = �TE�, �LUISWADI� = �LU�, �NITINCOMPANYJUNCTION� = �NI�, �CADBURRYJUNCTION� = �CA�

Given, n=8, where n is number of total BusStops.

BusStops = [ �TH�, �GA�, �IC�, �HA�, �TE�, �LU�, �NI�,�CA� ]

Write a code with function getFare(String Source, String Destination) which take Input as 
source and destination stops(in the format containing first two characters of the Name of the Bus Stop) 
and calculate and return travel fare.

Example 1:

Input Values
ca
Ca
Output Values

INVALID OUTPUT

Example 2:

Input Values
NI
HA
Output Values

23.0 INR

Note: Input and Output should be in format given in example.
Input should not be case sensitive and output should be in the format <FLOAT>  INR

 */
package NQTCodingQuestions_2020;
import java.util.Scanner;

public class BusFair {
	int getFair(String source,String destination)
	{ 
		int path[]=   { 800,600, 750, 900, 1400,1200,1100,1500};
		String[] BusStops={"TH","GA","IC","HA","TE","LU","NI","CA"};
		int sourceIndex=0,desIndex=0,dist=0;
		for(int i=0;i<8;i++)
		{
			if((source).equals(BusStops[i]))
			{
				sourceIndex=i;
			}
			if((destination).equals(BusStops[i]))
			{
				desIndex=i;
			}
		}
		int temp1=(sourceIndex);	
		while(temp1!=desIndex)
		{
			temp1=(temp1+1)%8;
			dist=dist+path[temp1];
		}			
		
		double givenfare=0.005;
		int fare=(int) Math.ceil(givenfare * dist);
	
		return fare;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String src=sc.next();
		String des=sc.next();
		BusFair bf= new BusFair();
		int fare=(int)bf.getFair(src,des);
		System.out.println("fair:"+fare+" INR");
		sc.close();
		
	}

}
