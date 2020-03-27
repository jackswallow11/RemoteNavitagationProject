package Main;

public class userDescription {

	public static void userManualInstruction() {
		System.out.println("INSTRUCTION OF USING THE REMOTE NAVIGATION FINCH!!! PLEASE READ TO AVOID ERORRS!!!");
		System.out.println("");
	}
	public static void numberOnlyDescription() {
		System.out.println("You cannot enter a letter, words, or any sign in the finch speed and duration space it should be only a number!!");
		
	}
	public static void commandErrorDescription() {
		System.out.println("Please enter an appropraite command to the Finch: F(Forward)||L(Left)||R||Right||S(Stop)||B(Backtracking))");
		System.out.println("Following by duration and speed delimited in spaces as instructed");
	}
	public static void speedErrorDescription() {
		System.out.println("Please enter speed value of the finch ranging from -100-100");
	}
}
