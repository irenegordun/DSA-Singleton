package edu.upc.dsa;

import org.apache.log4j.Logger;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        I18NManager i18n = I18NManager.getInstance();
        //logger
        Logger logger = Logger.getLogger(I18NManager.class);

        try {
            //key l1
            logger.info(i18n.getText("ca", "l1"));
            logger.info(i18n.getText("es", "l1"));
            logger.info(i18n.getText("it", "l1"));
            logger.info(i18n.getText("pt", "l1"));
            //key l2
            logger.info(i18n.getText("ca", "l2"));
            logger.info(i18n.getText("es", "l2"));
            logger.info(i18n.getText("it", "l2"));
            logger.info(i18n.getText("pt", "l2"));
            logger.info(i18n.getText("XX", "l2") );
        }

        catch (MissingResourceException e) { logger.info(e.getMessage()); }
    }
}
