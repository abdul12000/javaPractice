package javaPractice5;

import org.testng.annotations.Test;

public class SingletonPartern {
	
	
	private static SingletonPartern instance = new SingletonPartern();
	
	private SingletonPartern(){};
	
	public static SingletonPartern getInstance(){
		return instance;
		
	}
	
	
	
public void stateColor(){
                         System.out.println("This is blue color");
}

@Test
public void useSingleton(){
	SingletonPartern Object = SingletonPartern.getInstance();
	Object.stateColor();
}

}
