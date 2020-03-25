package Main;

import java.util.Scanner;

import com.birdbraintechnologies.Finch;



public class InputController {

	
	//this class is the first stage which collects input from user using scanner object
	public static void InputController(){
		char forward_cap = 'F';
		char forward_small = 'f';
		char left_cap = 'L';
		char left_small ='l';
		char right_cap = 'R';
		char right_small ='r';
		char stop_cap='S';
		char stop_small='s';
		char backtrack_cap = 'B';
		char backtrack_small = 'b';
	       
		Scanner scan = new Scanner(System.in);
		String userInput= scan.nextLine();
		
		String[] SpaceSpliter = userInput.split(" "); //split by space into a String array

	
		try {

			String command = SpaceSpliter[0]; //String command takes in the first part of the array 		
			char CharCommand = InputRestrictor.CommandRestrictor(command); //returns a character from the String split that the user input and calls function to loop through apropraite command
			
			
			String S_duration = SpaceSpliter[1]; //String duration take the second part of the array 
			int duration =Integer.parseInt(S_duration); //convert from string input to just delimited by int
			int FinchDuration = UserInputConverter.DurationConverter(duration); //converts from user input duration to finch time. 1s=1000s(finchtime)
			
			
			String S_Speed_Left= SpaceSpliter[2]; //String duration take the third part of the array 
			int speedLeft = Integer.parseInt(S_Speed_Left);	 //convert from string input to just delimited by int
			int FinchSpeedLeft = UserInputConverter.SpeedConverter(speedLeft); //convert from user input speed to finch speed. 100(user_speed)=255(finch_speed)
			
			String S_Speed_Right = SpaceSpliter[3]; //String duration take the third part of the array 
			int speedRight = Integer.parseInt(S_Speed_Right); //convert from string input to just delimited by int
			int FinchSpeedRight = UserInputConverter.SpeedConverter(speedRight); //convert from user input speed to finch speed. 100(user_speed)=255(finch_speed)
			
			InputRestrictor.CommandCatcher(CharCommand);
			InputRestrictor.DurationRestrictor(FinchDuration);
			InputRestrictor.SpeedRestrictor(FinchSpeedLeft);
			InputRestrictor.SpeedRestrictor(FinchSpeedRight);
			
			
			System.out.println(CharCommand+" "+FinchDuration+" "+FinchSpeedLeft+" "+" "+FinchSpeedRight);
			
			if(CharCommand==forward_cap||CharCommand==forward_small) {
				MovementClass.ForwardMovement(FinchSpeedLeft,FinchSpeedLeft,FinchDuration);
			}
			else if(CharCommand==left_cap||CharCommand==left_small) {
				InputRestrictor.LeftTurnRestrictor(FinchSpeedLeft, FinchSpeedRight);
				MovementClass.LeftMovement(FinchSpeedLeft,FinchSpeedRight,FinchDuration);
			}
			else if(CharCommand==right_cap||CharCommand==right_small) {
				InputRestrictor.RightTurnRestrictor(FinchSpeedLeft, FinchSpeedRight);
				MovementClass.RightMovement(FinchSpeedLeft,FinchSpeedRight,FinchDuration);
			}
//			else if(CharCommand==stop_cap||CharCommand==stop_small) {
//				MovementClass.StopMovement();
//			}
		} catch (java.lang.NumberFormatException e) { // catch when user type string instead of int in the duration and speed {
			System.out.println("You cannot enter a letter, words, or any sign in the finch speed and duration space it should be only a number!!");
			System.exit(0);
		}
		 catch (java.lang.ArrayIndexOutOfBoundsException e) //less input than it should be
		{
			System.out.println("lol");
		}
		
		
		
		
		
		
	
		
		
		
		//try catch when user put string insread of character
		//try catch for forward F 4 100 only 3 input but this is 4 input
		//use inheritance exends to do while loop in another class
		//https://www.youtube.com/watch?v=JTjeGpSUL2M
		//https://www.youtube.com/watch?v=K_-3OLkXkzY&t=333s
		

	}
		

       

	
}
