package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Kamar extends Model {
	
    @Required
    public String TipeKamar;
    
    @Required
    public String NomorKamar;

    @Required
    public Pelanggan objpelanggan;
}


