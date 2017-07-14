import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Agetest3 {

	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println("enter the dob in the for dd/mm/1996");
		Scanner sc=new Scanner(System.in);
		String dateInstring=sc.next();
		/*String dateInstring="23/03/1992";*/
		Date pastDate = dateFormat.parse(dateInstring);
		
		long pastTimeInMilliSeconds = pastDate.getTime();
		long presenTimelliSeconds = date.getTime();
		
		if(pastTimeInMilliSeconds>presenTimelliSeconds) {
			
		  System.out.println("age should not be greater");
		} else {
		   long diff = presenTimelliSeconds-pastTimeInMilliSeconds;
		   long days = diff/(24*60*60*1000);
		   long years = days/365;  
		   long months= days%365;
		   long days1= months%30;
		   System.out.println("the age is"+years);
		   System.out.println("the months are"+months/30);
		   System.out.println("the days are"+days1);
		 
		   
		}
	 sc.close();

	}

}
