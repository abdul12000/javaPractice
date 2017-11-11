package javapractice;

import org.testng.annotations.Test;


//ERROR - multiple inheritance IS NOT allowed in java
@Deprecated
public class ChildLevel extends ChildClassForVehicle{
	
public void exhaust(){
	System.out.println("implementing exhaust");
}

@Test(alwaysRun=false)

public void childLevelMethod(){
ChildLevel cl = new ChildLevel();
	cl.colour();
	cl.audioSystem();
	cl.exhaust();

}

}
