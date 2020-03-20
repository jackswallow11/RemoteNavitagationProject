package Main;

public class UserInputConverter {
	public static int DurationConverter(int duration) {
		int result = duration*1000; //convert from 1s as user input to 1000 Finch input duration
		return result;
	}
	public static int SpeedConverter(int speed) {
		int result = (speed*255)/100;
		return result; //convert from 100 user input to 255
	}

}
