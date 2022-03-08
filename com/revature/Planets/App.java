package com.revature.Planets;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        Tomcat server = new Tomcat();
        server.getConnector();
        server.addContext("", null);
        server.addServlet("", "defaultServlet", new Server()).addMapping("/*");

        try{
            server.start();
        } catch(LifecycleException e){
            System.err.println("Failed to start server: " + e.getMessage());
        }
    }
}
