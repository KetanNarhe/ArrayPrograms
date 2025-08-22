package Array;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {

	public static void main(String[] args) {

		
		int Day,Month,Year;
		
		int Second,Minute,Hour;
		
	    GregorianCalendar date=new   GregorianCalendar();
	    
	   
	     Day = date.get(Calendar.DAY_OF_MONTH);
	     
	     Month=date.get(Calendar.MONTH)+1;
	     
	     Year=date.get(Calendar.YEAR);
	     
	     
	     Hour=date.get(Calendar.HOUR_OF_DAY);
	     
	     Minute=date.get(Calendar.MINUTE);
	     
	     Second=date.get(Calendar.SECOND);
	     
	     
	     System.out.println("Current Date:"+Day+ "/" +Month+ "/" +Year);
	     System.out.println("Current time:"+Hour+"/"+Minute+"/"+Second);


	}

}
