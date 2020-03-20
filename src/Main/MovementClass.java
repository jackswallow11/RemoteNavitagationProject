package Main;
import com.birdbraintechnologies.Finch;
public class MovementClass {
	Finch myfinch = new Finch();

       public void ForwardMovement(){
    	myfinch.setWheelVelocities(255, 255, 1000);   
       }
}
