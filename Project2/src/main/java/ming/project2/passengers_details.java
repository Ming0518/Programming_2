package ming.project2;
import java.util.*;

class passengers_details{
            static Scanner scan = new Scanner(System.in);
    String name, email,phone;
      int ticknum;

    
    passengers_details(String nms, String em, String ph, int num2){
            name= nms;
            phone= ph;
            email = em;
            ticknum = num2;
    }
    
    public int getTicketNum() {
		return ticknum;
	}
    
        public String toString() {
		return String.format("%-13d%-22s%-20s%s\n", ticknum,name,phone,email);
		
	}

  }