package com.company.day5;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackExample {
    private static final Logger logger = LoggerFactory.getLogger(LogbackExample.class);

    public static void main(String[] args) {
        logger.info("Example log from {}", LogbackExample.class.getSimpleName());

        ch.qos.logback.classic.Logger parentLogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(LogbackExample.class);
        parentLogger.setLevel(Level.INFO);
        Logger childlogger = LoggerFactory.getLogger(LogbackExample.class);
        parentLogger.warn("This message is logged because WARN > INFO.");
        parentLogger.debug("This message is not logged because DEBUG < INFO.");
        childlogger.info("INFO == INFO");
        childlogger.debug("DEBUG < INFO");
    }
}
