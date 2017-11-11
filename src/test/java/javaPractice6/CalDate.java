package javaPractice6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

public class CalDate {
	
	   public String getFutureDateBy(int days) {
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.DATE, days);
	        return dateFormat.format(cal.getTime());
	    }
	   @Test
		public void printvalue() {
		   String adate = getFutureDateBy(2);
			System.out.println(adate);
			//List<String> aString = adate.spl
		}


}
