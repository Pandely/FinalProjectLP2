/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cinebox;

/**
 *
 * @author hebertcb
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer {

   /* public static void main(String[] args) {
        SpringApplication.run(Initializer.class, args);
        
    }  */
    
    
    /*protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Initializer.class);
    }  */  
    
    @Override
    public void onStartup(ServletContext servletContext)
                    throws ServletException {
            AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
            ctx.register(WebAppConfig.class);
            servletContext.addListener(new ContextLoaderListener(ctx));

            ctx.setServletContext(servletContext);

            Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
            servlet.addMapping("/");
            servlet.setLoadOnStartup(1);
    }

}