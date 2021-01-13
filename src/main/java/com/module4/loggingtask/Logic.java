package com.module4.loggingtask;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Logic
{
    private static final Logger logger = LogManager.getLogger(Logic.class);
    private void privateMethod()
    {
        System.out.println("This is private Hello =)");
        logger.info("Private method had worked!");
    }
    public void publicMethod()
    {
        System.out.println("I'm going to show you something special...");
        privateMethod();
        logger.trace("Public method had worked!");
    }
}
