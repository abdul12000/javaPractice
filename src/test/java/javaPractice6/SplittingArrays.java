package javaPractice6;

import org.testng.annotations.Test;

public class SplittingArrays {

	private String pass = "1,2,3,4,5,6,7,8";

	private String get_value_of(int x) {
		String[] output = pass.split(",");
		return output[x];
	}

	@Test
	public void printvalue() {
		System.out.println(get_value_of(2));
	}


}
