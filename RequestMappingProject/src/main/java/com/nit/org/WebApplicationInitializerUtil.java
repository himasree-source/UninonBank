package com.nit.org;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationInitializerUtil implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(MocUtil.class);

		DispatcherServlet servlet = new DispatcherServlet(applicationContext);
		Dynamic dynamic = servletContext.addServlet("dispatcherServlet", servlet);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/");
	}
}
