package controllers;

import play.mvc.*;

import play.data.validation.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	Date now = new Date();
        render(now);
    }
    public static void list() {
        List<DataPelanggan> DataPelanggan1 = DataPelanggan.find("NAMA PEMESAN :\n").fetch();
        render(DataPelanggan1);
    }
        public static void form(Long id) {
            if(id == null) {
                render();
    }
        DataPelanggan DataPelanggan2 = DataPelanggan.findById(id);
        render(DataPelanggan2);
   }
