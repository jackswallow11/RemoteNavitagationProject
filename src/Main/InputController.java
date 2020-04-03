package Main;

import java.util.Scanner;

import com.birdbraintechnologies.Finch;



public class InputController {
	static char forward_cap = 'F';
	static char forward_small = 'f';
	static char left_cap = 'L';
	static char left_small ='l';
	static char right_cap = 'R';
	static char right_small ='r';
	static char stop_cap='S';
	static char stop_small='s';
	static char backtrack_cap = 'B';
	static char backtrack_small = 'b';
	static char error = 'e';
	
	static String command;
	static char CharCommand;
	static String S_duration;
	static int duration;
	static int FinchDuration;
	static String S_Speed_Left;
	static int speedLeft;
	static int FinchSpeedLeft;
	static String S_Speed_Right;
	static int speedRight;
	static int FinchSpeedRight;
	
	//this class is the first stage which collects input from user using scanner object
	public static void Input_Controller(){
		Scanner scan = new Scanner(System.in);
		String userInput= scan.nextLine();
		
		String[] SpaceSpliter = userInput.split(" "); //split by space into a String array

		
	
		try {

			command = SpaceSpliter[0]; //String command takes in the first part of the array 		
			CharCommand = InputRestrictor.CommandRestrictor(command); //returns a character from the String split that the user input and calls function to loop through apropraite command
			
			
			S_duration = SpaceSpliter[1]; //String duration take the second part of the array 
			duration =Integer.parseInt(S_duration); //convert from string input to just delimited by int
			FinchDuration = UserInputConverter.DurationConverter(duration); //converts from user input duration to finch time. 1s=1000s(finchtime)
			
			
			S_Speed_Left= SpaceSpliter[2]; //String duration take the third part of the array 
			speedLeft = Integer.parseInt(S_Speed_Left);	 //convert from string input to just delimited by int
			FinchSpeedLeft = UserInputConverter.SpeedConverter(speedLeft); //convert from user input speed to finch speed. 100(user_speed)=255(finch_speed)
			
			S_Speed_Right = SpaceSpliter[3]; //String duration take the third part of the array 
			speedRight = Integer.parseInt(S_Speed_Right); //convert from string input to just delimited by int
			FinchSpeedRight = UserInputConverter.SpeedConverter(speedRight); //convert from user input speed to finch speed. 100(user_speed)=255(finch_speed)
			
			InputRestrictor.CommandCatcher(CharCommand);
			InputRestrictor.DurationRestrictor(FinchDuration);
			InputRestrictor.SpeedRestrictor(FinchSpeedLeft);
			InputRestrictor.SpeedRestrictor(FinchSpeedRight);
			
			
			if(CharCommand==left_cap||CharCommand==left_small) {
				InputRestrictor.LeftTurnRestrictor(FinchSpeedLeft, FinchSpeedRight);
				MovementClass.LeftMovement(FinchSpeedLeft,FinchSpeedRight,FinchDuration);
				StackMethod.StackAdd(FinchSpeedLeft,FinchSpeedRight,FinchDuration,CharCommand);
			}
			else if(CharCommand==right_cap||CharCommand==right_small) {
				InputRestrictor.RightTurnRestrictor(FinchSpeedLeft, FinchSpeedRight);
				MovementClass.RightMovement(FinchSpeedLeft,FinchSpeedRight,FinchDuration);
				StackMethod.StackAdd(FinchSpeedLeft,FinchSpeedRight,FinchDuration,CharCommand);
			}
			else {
				UserDescription.commandErrorDescription();
				System.exit(0);
			}
	
		} 
		catch (java.lang.NumberFormatException e) { // catch when user type string instead of int in the duration and speed {	
			UserDescription.numberOnlyDescription();
			System.exit(0);
		}
		
		 catch (java.lang.ArrayIndexOutOfBoundsException e) //less input than it should be error handling
		{
			
			 S_Speed_Right=null;
			 CharCommand = InputRestrictor.CommandRestrictor(command);
			 InputRestrictor.CommandCatcher(CharCommand);
			
			 if((command!=null&&S_duration==null&&S_Speed_Left==null&&S_Speed_Right==null)) {
				 if(CharCommand==stop_small||CharCommand==stop_cap) {
					 MovementClass.StopMovement();
					 System.exit(0);
					 }
				 else {
					 UserDescription.commandErrorDescription();
					 System.exit(0); 
						 }
			 } 
			 else if(command!=null&&S_duration!=null&&S_Speed_Left==null&&S_Speed_Right==null) {
				 if(CharCommand==backtrack_small||CharCommand==backtrack_cap) {
					 
					 StackMethod.StackRetrieve(duration);//value that determines how many commands the finch needs to retrace
					 //use duration value because we split it is the second element in the array
					 StackMethod.RemoveAllStack(); //remove all stack one backtrack method is called 
				
					 
				 }
				 else if(CharCommand==stop_small||CharCommand==stop_cap) {
					 MovementClass.StopMovement();
			
				 }
				 else {
					 UserDescription.commandErrorDescription();
					 System.exit(0);
				 }
				 
			 }
			 else if(command!=null&&S_duration!=null&&S_Speed_Left!=null&&S_Speed_Right==null)
			{
				 if(CharCommand==forward_small||CharCommand==forward_cap) {
					 
					 InputRestrictor.DurationRestrictor(FinchDuration);
					InputRestrictor.SpeedRestrictor(FinchSpeedLeft);
					MovementClass.ForwardMovement(FinchSpeedLeft,FinchSpeedLeft,FinchDuration); 
					StackMethod.StackAdd(FinchSpeedLeft,FinchSpeedLeft,FinchDuration,CharCommand);
				 }
				 	 
				 else if(CharCommand==backtrack_small||CharCommand==backtrack_cap) {
					 StackMethod.StackRetrieve(duration); //value that determines how many commands the finch needs to retrace
					 //use duration value because we split it is the second element in the array
					 //keep in mind that if b command is left out the backtrack number or known as duration it will take the previous duration value input as the b durtation input 
					 StackMethod.RemoveAllStack(); //remove all stack one backtrack method is called 
				 }
				 else if(CharCommand==stop_small||CharCommand==stop_cap) {
					 MovementClass.StopMovement();
			
				 }
				 else {
					 UserDescription.commandErrorDescription();
					 System.exit(0);
				 }
				 
			}
			 
		}

	}
		

       

	
}
