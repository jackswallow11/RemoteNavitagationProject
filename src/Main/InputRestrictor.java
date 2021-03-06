package Main;

public class InputRestrictor extends InputController {
	/*this method take the first part of array which is string command and just return back one character.
	(that is only part of the command which is move forward, left, right,stop or backtrack)*/ 
	//this is part of error handling
	
	public static char CommandRestrictor (String command) {
		   char result = 'e'; /*instantiate result as 'e' as a reference so if the user input 
		   					  the input that is not in the command it will return back 'e' and 
		   					  compare with and if statement so print and tell user that it is a wrong input*/

		    for(int i = 0; i < command.length(); i++)
		    {            
		        if(
		           command.charAt(i)=='L'||command.charAt(i)=='l'||
		           command.charAt(i)=='r'||command.charAt(i)=='R'||
		           command.charAt(i)=='f'||command.charAt(i)=='F'||
		           command.charAt(i)=='s'||command.charAt(i)=='S'||
		           command.charAt(i)=='b'||command.charAt(i)=='B') 
		        {
		            result = command.charAt(i);
		            break;
		        }
		    }

		    return result;
	}
	public static void CommandCatcher(char command) {
		if (command == 'e') //referncing back to the method "Command Restrictor" if the command is not F,L,S,B,R every output will turn to e which means its not an aprropraite command
		{
			UserDescription.commandErrorDescription();
			System.exit(0);
		}
	}
	public static void DurationRestrictor (int FinchDuration) {
		if(FinchDuration<1000||FinchDuration>6000) //in this case I took finch duration to compare but the user input is always from 1 to 6
		{
			UserDescription.DurationErrorDescription();
			System.exit(0); //it will close the program when user input wrong input 
		}
		
	}
	public static void SpeedRestrictor(int FinchSpeed) {
		if(FinchSpeed<-255||FinchSpeed>255) //in this case I took finch speed to compare but the user input is always from -100 to 100 
		{
			UserDescription.speedErrorDescription();
			System.exit(0); //it will close the program when user input wrong input 
		}
	}
	public static void LeftTurnRestrictor(int LeftSpeed, int RightSpeed) //this method checks that the right/left turn is always orthogonal to the current course
	{
		if(RightSpeed<LeftSpeed) {
			System.out.println("When you turn left your LeftSpeed "+speedLeft+ " Should be less than your Right speed "+ speedRight);
			System.out.println("Please try again!!");
			System.exit(0);
		}
		else if(RightSpeed==LeftSpeed) {
			System.out.println("This is a forward command because RightSpeed equal Left Speed");
			System.out.println("Please try again");
			System.exit(0);
		}
	}
	public static void RightTurnRestrictor(int LeftSpeed, int RightSpeed) //this method checks that the right/left turn is always orthogonal to the current course
	{
		if(LeftSpeed<RightSpeed) {
			System.out.println("When you turn right your RightSpeed "+speedRight+ " Should be less than your left speed "+ speedLeft);
			System.out.println("Please try again!!");
			System.exit(0);
		}
		else if(RightSpeed==LeftSpeed) {
			System.out.println("This is a forward command because RightSpeed equal Left Speed");
			System.out.println("Please try again");
			System.exit(0);
		}
	}
	public static void BacktrackIntegerRestrictor () {
		System.out.println("The number of backtrack moves cannot exceed the number of the move commands the finch has completed so far.");
		System.out.println("Please try again!!");
		System.exit(0);
	}
	
	
}
