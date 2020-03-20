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
		
		String command = SpaceSpliter[0]; //String command takes in the first part of the array 		
		char CharCommand = InputRestrictor.CommandRestrictor(command); //returns a character from the String split that the user input
		
		
		
		String S_duration = SpaceSpliter[1]; //String duration take the second part of the array 
		int duration =Integer.parseInt(S_duration); //convert from string input to just delimited by int
		int FinchDuration = UserInputConverter.DurationConverter(duration); //converts from user input duration to finch time. 1s=1000s(finchtime)
		
		
		String S_Speed_Left= SpaceSpliter[2]; //String duration take the third part of the array 
		int speedLeft = Integer.parseInt(S_Speed_Left);	 //convert from string input to just delimited by int
		int FinchSpeedLeft = UserInputConverter.SpeedConverter(speedLeft); //convert from user input speed to finch speed. 100(user_speed)=255(finch_speed)
		
		String S_Speed_Right = SpaceSpliter[3]; //String duration take the third part of the array 
		int speedRight = Integer.parseInt(S_Speed_Right); //convert from string input to just delimited by int
		int FinchSpeedRight = UserInputConverter.SpeedConverter(speedRight); //convert from user input speed to finch speed. 100(user_speed)=255(finch_speed)
		
		InputRestrictor.DurationRestrictor(FinchDuration);
		InputRestrictor.SpeedRestrictor(FinchSpeedLeft);
		InputRestrictor.SpeedRestrictor(FinchSpeedRight);
		
		
		System.out.println(CharCommand+" "+FinchDuration+" "+FinchSpeedLeft+" "+" "+FinchSpeedRight);
		
		
		//try catch when user put string insread of character
		//try catch for forward F 4 100 only 3 input but this is 4 input
		//use inheritance exends to do while loop in another class
		//https://www.youtube.com/watch?v=JTjeGpSUL2M
		//https://www.youtube.com/watch?v=K_-3OLkXkzY&t=333s
		
//		if(command.contains("f")){
//			
//			
//		}
		 
		
		
//		do{
//			 	userInput=scan.nextLine();
//			 	
//			 	SpaceSpliter = userInput.split(" ");
//				
//			 	command = SpaceSpliter[0]; //String command
//				
//			 	S_duration = SpaceSpliter[1];
//				duration =Integer.parseInt(S_duration);
//				
//				S_Speed_Left= SpaceSpliter[2];
//				speedLeft = Integer.parseInt(S_Speed_Left);
//				
//				S_Speed_Right = SpaceSpliter[3];
//				speedRight = Integer.parseInt(S_Speed_Right);		
//				
//					
//					
//		}while(!(command.equals("s")));
	}
		

       

	
}
