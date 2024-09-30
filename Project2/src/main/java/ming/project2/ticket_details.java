
package ming.project2;
import java.util.*;
class ticket_details{
        static Scanner scan = new Scanner(System.in);

    String  date,place,cabin,month,time;
    int ticknum,num;
    
ticket_details( String pc,String cb,String dt,String mt, String tm, int num1,int num2){
                place = pc;
                cabin = cb;
                date= dt;
                month = mt ;
                time = tm;
                num = num1;
                ticknum = num2;
	}

public int getTicketNum() {
		return ticknum;
	}

public String getTicketDate() {
		return date;
	}

public String getTicketMonth() {
		return month;
	}

public String getTicketClass() {
		return cabin;
	}

public String getTicketPlace() {
		return place;
	}

public int getTicketNu() {
		return num;
	}

public String toString() {
	return String.format("%-13d%-15s%-10s%-10s%-15s%d\n", ticknum,place,cabin,date + "/" + month,time,num);
		
	}
 }