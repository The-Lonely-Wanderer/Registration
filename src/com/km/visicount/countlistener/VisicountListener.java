package com.km.visicount.countlistener;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.spi.http.HttpContext;

import com.km.registeandlogin.server.VisiterServer;

/**
 * Application Lifecycle Listener implementation class VisicountListener
 *
 */
@WebListener
public class VisicountListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public VisicountListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	VisiterServer counts = new VisiterServer();
    	counts.updatecounts((int)sce.getServletContext().getAttribute("count"));
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	VisiterServer counts = new VisiterServer();
    	sce.getServletContext().setAttribute("count",counts.getcounts());	
    }
	
}
