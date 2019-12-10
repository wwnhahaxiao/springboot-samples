package com.roshan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {
    private SSHConnection conexionssh;
    private static final Logger log = LoggerFactory.getLogger(MyContextListener.class);

    public MyContextListener() {
        super();
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        try {
            conexionssh = new SSHConnection();
        } catch (Throwable e) {
            log.error(e.getMessage(), e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        conexionssh.closeSSH();
    }
}
