package javapractice;
import org.testng.annotations.Test;

import demopack.CentralTraffic;
import demopack.ContinentalTraffic;

public class EnglandTraffic implements CentralTraffic, ContinentalTraffic {

	
	

	@Test
	public void Englandtraffimplentation(){
		CentralTraffic a = new EnglandTraffic();
		ContinentalTraffic b = new EnglandTraffic();
	a.redStop();
	a.greenGo();
	a.FlashYellow();
	
	b.trainSymbol();
	}
	
	
	public void redStop(){
		System.out.println("Implementation for redStop");}
	public void greenGo() {
		System.out.println("Implementation for greenGo");
	}
	public void FlashYellow() {
		System.out.println("Implementation for YellowFalsh");
	}


	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Implementation for TrainSymbol");
	}





}
