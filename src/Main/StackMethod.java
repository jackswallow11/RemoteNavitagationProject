package Main;

import java.util.ArrayList;
import java.util.Stack;

public class StackMethod extends InputController{

	static Stack<Integer> StackSpeedLeft = new Stack<Integer>();
	static Stack<Integer> StackSpeedRight = new Stack<Integer>();
	static Stack<Integer> StackDuration = new Stack<Integer>();
	static Stack<Character> StackCharCommand = new Stack<Character>();

	public static void StackAdd(int SpeedLeft,int SpeedRight, int Duration, char CharCommand) //add the element into the stack data 
	{
		StackSpeedLeft.add(SpeedLeft);
		StackSpeedRight.add(SpeedRight);
		StackDuration.add(Duration);
		StackCharCommand.add(CharCommand);
		
	}
	public static void StackRetrieve(int duration) //stack implementation of LIFO
	{
		
		for(int i=0;i<duration;i++) {
			if(duration>StackCharCommand.size()) {
				InputRestrictor.BacktrackIntegerRestrictor();
				
			}
			else{
				MovementClass.BacktrackMovement(StackSpeedLeft.pop(), StackSpeedRight.pop(), StackDuration.pop());
				
			}
		
			
		}
	
	
	}
	public static void RemoveAllStack() //removing all element in the stack when this method is called
	{
		StackSpeedLeft.removeAllElements();
		StackSpeedRight.removeAllElements();
		StackDuration.removeAllElements();
		StackCharCommand.removeAllElements();
	}
}
