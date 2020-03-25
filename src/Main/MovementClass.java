package Main;
import com.birdbraintechnologies.Finch;
public class MovementClass {
	static Finch myfinch = new Finch();

       public static void ForwardMovement(int LeftSpeed, int RightSpeed, int Duration) //move forward command
       {
    	
    	   myfinch.setWheelVelocities(LeftSpeed, RightSpeed, Duration);   
       
       }
       public static void LeftMovement(int LeftSpeed, int RightSpeed, int Duration) // turn left command
       {
       	
    	   myfinch.setWheelVelocities(LeftSpeed, RightSpeed, Duration);   
          
       }
       public static void RightMovement(int LeftSpeed, int RightSpeed, int Duration) // turn right command
       {
          	
    	   myfinch.setWheelVelocities(LeftSpeed, RightSpeed, Duration);   
          
       }
       public static void StopMovement() // stop the Finch
       {
         	
    	   myfinch.stopWheels();  
    	   myfinch.quit();
          
       }
       
       
}
