import java.util.Date;
import java.time.Month;
import java.time.LocalDate;
public class Main
{
	public static void main(String[] args) {
	    String date = "2020-07-18";
		LocalDate a = LocalDate.parse(date);
		int day=a.getDayOfMonth();
		Month mon=a.getMonth();
		int yr=a.getYear();
		System.out.println(day);
		System.out.println(mon);
		System.out.println(yr);
	}
}
/* output
  18
  JULY
  2020
*/
