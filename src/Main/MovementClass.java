package Main;
import com.birdbraintechnologies.Finch;
public class MovementClass {
	static Finch myfinch = new Finch();

       public static void ForwardMovement(int LeftSpeed, int LeftSpeed1, int Duration) //move forward command
       {
    	
    	   myfinch.setWheelVelocities(LeftSpeed, LeftSpeed1, Duration); 
    	   myfinch.setLED(0,255,0, Duration); //green
       
       }
       public static void LeftMovement(int LeftSpeed, int RightSpeed, int Duration) // turn left command
       {
 
    	   myfinch.setWheelVelocities(LeftSpeed, RightSpeed, Duration);  
    	   myfinch.setLED(0,255,0, Duration); //green
          
       }
       public static void RightMovement(int LeftSpeed, int RightSpeed, int Duration) // turn right command
       {
          	
    	   myfinch.setWheelVelocities(LeftSpeed, RightSpeed, Duration);   
    	   myfinch.setLED(0,255,0, Duration); //green
          
       }
       public static void StopMovement() // stop the Finch
       {
         	
    	   System.out.println("Finch Exit! BYE");
    	   myfinch.stopWheels();  
    	   myfinch.setLED(255,0,0); //red
    	   myfinch.quit();
    	   System.exit(0);
          
       }
       
       
}
