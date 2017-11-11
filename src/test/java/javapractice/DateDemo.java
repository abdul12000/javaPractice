package javapractice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class DateDemo {

	@Test
	public void dateDem(){
		Date d = new Date();
	
		
		//to get SimpleDateFormat in form of mm/dd/yy HH:MM:SS
		
		// More info can be found in - https://www.tutorialspoint.com/java/java_date_time.htm
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("M/d/yyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
		System.out.println(d.toString());

		
	}
}
