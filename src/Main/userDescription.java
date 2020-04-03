package Main;

public class UserDescription {

	public static void userManualInstruction() {
		System.out.println("INSTRUCTION OF USING THE REMOTE NAVIGATION FINCH!!! PLEASE READ TO AVOID ERORRS!!!");
		System.out.println("THERE ARE 5 COMMAND TO MAKE THE FINCH MOVE FINCH SPEED RANGE from -100(FULLSPEED BACKWARD to 100) AND DURATION RANGE FROM 1 to 6 SEC");
		System.out.println("TO MOVE YOUR FINCH FORWARD: F DURATION FINCHSPEED ---> F 4 100");
		System.out.println("OTHER COMMAND WILL BE FOLLOWED AS IN THE DOCUMENTATION...");
	
	}
	public static void numberOnlyDescription() {
		System.out.println("You cannot enter a letter, words, or any sign in the finch speed and duration space it should be only a number!!");
		
	}
	public static void commandErrorDescription() {
		System.out.println("Please run the program again and enter an appropraite command to the Finch: F(Forward)||L(Left)||R||Right||S(Stop)||B(Backtracking))");
		System.out.println("Following by duration and speed delimited in spaces as instructed");
	}
	public static void speedErrorDescription() {
		System.out.println("Please enter speed value of the finch ranging from -100 to 100");
	}
	public static void DurationErrorDescription() {
		System.out.println("Please Enter The correct amount of duration. The finch can only go from 1 to 6 (seconds)");
	}
	
}
