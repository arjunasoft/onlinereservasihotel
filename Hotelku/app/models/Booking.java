package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Booking extends Model {
	
    @Required
    public String TanggalBooking;
    
    @Required
    public String JumlahBooking;
   
    //public static void
}
