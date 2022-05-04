package edu.upc.dsa;

import java.util.*;
import java.util.logging.Logger;

public class I18NManager {
    private static I18NManager instance;
    private ResourceBundle ca, es, it, pt;
    final static Logger logger = Logger.getLogger(I18NManager.class.getName());


    private I18NManager (){
        this.ca = ResourceBundle.getBundle("ca");
        this.es = ResourceBundle.getBundle("es");
        this.it = ResourceBundle.getBundle("it");
        this.pt = ResourceBundle.getBundle("pt");

    }

    public static I18NManager getInstance(){ // Metode Public acces
        if(instance==null){
            instance= new I18NManager();
            logger.info("Nova instània");
        }
        return instance;
    }

    public String getText(String s, String key){
        logger.info("Lenguage: " + s + " key " + key);
        String r = null;
        switch(s){
            case "ca": r=this.ca.getString(key); break;
            case "es": r=this.es.getString(key); break;
            case "it": r=this.ca.getString(key); break;
            case "pt": r=this.ca.getString(key); break;
            default: logger.info("Lenguage not valid"); break;
        }
        return r;
    }
    public void clear(){
        instance=null;
    }
}
