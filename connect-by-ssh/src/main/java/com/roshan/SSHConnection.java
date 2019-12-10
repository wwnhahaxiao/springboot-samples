package com.roshan;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class SSHConnection {
    private final static int LOCAL_PORT = 3306;
    private final static int REMOTE_PORT = 8066;
    private final static int SSH_REMOTE_PORT = 22;
    private final static String SSH_USER = "xianbo.ji";
    private final static String SSH_PASSWORD = "Cc48Nn7'7anK";
    private final static String SSH_REMOTE_SERVER = "47.95.110.17";
    private final static String MYSQL_REMOTE_SERVER = "192.168.101.197";

    private static final Logger log = LoggerFactory.getLogger(SSHConnection.class);

    private Session sesion;

    public void closeSSH() {
        sesion.disconnect();
    }

    public SSHConnection() {
        log.info("try to set up a ssh connection");
        try {
            JSch jsch = new JSch();
            sesion = jsch.getSession(SSH_USER, SSH_REMOTE_SERVER, SSH_REMOTE_PORT);
            sesion.setPassword(SSH_PASSWORD);
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            sesion.setConfig(config);
            sesion.connect();
            //将请求到本地LOCAL_PORT端口的请求转发到MYSQL_REMOTE_SERVER:REMOTE_PORT
            sesion.setPortForwardingL(LOCAL_PORT, MYSQL_REMOTE_SERVER, REMOTE_PORT);
            log.info("connect success remoteServer:{}", SSH_REMOTE_SERVER + ":" + SSH_REMOTE_PORT);
        } catch (Exception e) {
            log.error("connect failed");
            log.error(e.getMessage(), e);
        }

    }
}