package controllers;

import play.mvc.*;

import play.data.validation.*;

import java.util.*;

import models.*;
	
public class Application extends Controller {
	
    public static void index() {
    //	Date now = new Date();
     //   render(now);
    	render();
    }
   /* public static void list() {
        List<Pelanggan> Pelanggan1 = Pelanggan.find("order by NamaPelanggan, TanggalPemesanan").fetch();
        render(Pelanggan1);
    }
        public static void form(Long id) {
            if(id == null) {
                render();
    }
        Pelanggan Pelanggan2 = Pelanggan.findById(id);
        render(Pelanggan2);
   }
        public static void save(@Valid data_pengguna data_pengguna) {
            if(validation.hasErrors()) {
                if(request.isAjax()) error("Invalid value");
                render("@form", Pelanggan);
            }
            Pelanggan.save();
            list();
        }
*/
    }
