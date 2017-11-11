package javapractice;

import org.testng.annotations.Test;


public class EnumDemo {
	Directions dir;
	public EnumDemo(Directions dir){
		this.dir= dir;
	}
	
	public void getMyDirection(){
		switch (dir){
		case EAST:
			System.out.println("In the East Direction");
			break;
			
		case WEST:
			System.out.println("In the WEST Direction");
			break;
			
		case NORTH:
			System.out.println("In the NORTH Direction");
			break;
			
		case SOUTH:
			System.out.println("In the SOUTH Direction");
			break;
		}
	}
	
@Test
public void useDirections(){
	EnumDemo obj1 = new EnumDemo(Directions.EAST);
	obj1.getMyDirection();
	
	EnumDemo obj2 = new EnumDemo(Directions.WEST);
	obj2.getMyDirection();
}
	
@Test
public void useDirectionsb(){
	for (Directions dir : Directions.values()) {
	    System.out.println(dir);
	}
}
	

}
