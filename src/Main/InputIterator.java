package Main;

public class InputIterator extends InputController {
public void InputLooping(){
	
	do {
		InputController.Input_Controller();
	}while(true); 
	/*this loop will infinitely loop as long as the condition is 
	true, the only stopping point is in InputController class where it 
	condition of the assignment*/
		
	
}
}