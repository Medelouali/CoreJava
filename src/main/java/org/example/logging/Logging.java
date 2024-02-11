package org.example.logging;

import java.util.logging.*;

public class Logging {
    public static final Logger logger=Logger.getLogger(org.example.logging.Logging.class.getName());
    public static void run() {
        double x=23.3;
        // Doing some logs
        logger.info( "["+org.example.logging.Logging.class.getName()+"] This is an info log from the logging class");
        logger.warning("["+org.example.logging.Logging.class.getName()+"] This is a warning log from the logging class");
        logger.severe("["+org.example.logging.Logging.class.getName()+"] This is a severe log from the logging class");
        logger.fine("["+org.example.logging.Logging.class.getName()+"] This is a fine log from the logging class");
        logger.config("["+org.example.logging.Logging.class.getName()+"] This is a config log from the logging class");
        logger.logp(Level.INFO, org.example.logging.Logging.class.getName(),
                "run", "Something went wrong in the run method");
    }
}
