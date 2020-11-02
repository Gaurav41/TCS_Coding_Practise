/*
Consider there are n positive integers representing total number of Trains running between Station 
RS[0] and RS[d-1]. RS is the array containing Railway Stations in order of sequence of the stations 
located one after other. The d represents the total number of the stations. RS[0] and RS[d-1] are 
the stations at  both ends. There is another array T of the size d which is equal to the size of RS.
 T represents the time in minutes between the last and current station. Array positions can be mapped 
 for RS and T in such a way that the train will take time T[k] to reach the station RS[k] from station 
 RS[k-1].

N trains starts at RS[0] at different timestamps represented by float value to indicate hour value 
before precision point and minute value after precision point. (11.30)

Values of RS and T are given as -

RS[0] = PANVEL T[0] = 0

RS[1] = KHANDESHWAR T[1] = 4

RS[2] = MANSAROVAR T[2] = 5

RS[3] =  KHARGHAR T[3] = 3

RS[4] = BELAPUR T[4] = 4

RS[5] = SEAWOOD T[5] = 5

RS[6] = NERUL T[6] = 3

Trains is set of values representing starting time (in float) for n number of trains running from 
PANVEL to NERUL, given as follows

Trains = [7.30,8.2,12.45,13.30,14.44,15.50,9.15,10.20,23.59,17.33,19.20 ]

Count the number of trains which are yet to arrive for current day at station where user is present 
at particular time.

Write code to return count of trains left for the day at station name and time entered by the user.

Note:- The time is represented in 24 Hour Fashion and assume that all trains start at station RS[0].

Example 1:

Input Values

Enter current time (hour.min)float

11.20

[‘PANVEL’, ‘KHANDESHWAR’, ‘MANSAROVAR’, ‘KHARGHAR’, ‘BELAR’, ‘SEAWOOD’, ‘NERUL’]

At which Station you are right now?(Choose from above)

kharghar

Output Values

11
 */
package NQTCodingQuestions;

public class Trains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
