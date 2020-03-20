package Main;

public class InputRestrictor {
	/*this method take the first part of array which is string command and just return back one character.
	(that is only part of the command which is move forward, left, right,stop or backtrack)*/ 
	//this is part of error handling
	
	public static char CommandRestrictor (String command) {
		   char result = 'e'; /*instantiate result as 'e' as a reference so if the user input 
		   					  the input that is not in the command it will return back 'e' and 
		   					  compare with and if statement so print and tell user that it is a wrong input*/

		    for(int i = 0; i < command.length(); i++)
		    {            
		        if(command.charAt(i)=='F'||command.charAt(i)=='f'||
		           command.charAt(i)=='L'||command.charAt(i)=='l'||
		           command.charAt(i)=='S'||command.charAt(i)=='s'||
		           command.charAt(i)=='B'||command.charAt(i)=='b'||
		           command.charAt(i)=='r'||command.charAt(i)=='R') 
		        {
		            result = command.charAt(i);
		            break;
		        }
		    }

		    return result;
	}
	public static void DurationRestrictor (int FinchDuration) {
		if(FinchDuration<1000||FinchDuration>6000) //in this case I took finch duration to compare but the user input is always from 1 to 6
		{
			System.out.println("Please Enter The correct amount of duration. The finch can go from 1 to 6 (seconds)");
			System.exit(0); //it will close the program when user input wrong input 
		}
		
	}
	public static void SpeedRestrictor(int FinchSpeed) {
		if(FinchSpeed<-255||FinchSpeed>255) //in this case I took finch speed to compare but the user input is always from -100 to 100 
		{
			System.out.println("Please Enter The correct amount of finch speed. The finch speed can only goes from -100 to 100");
			System.exit(0); //it will close the program when user input wrong input 
		}
	}
	
}
