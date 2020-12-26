package com.nit.org;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@PropertySource(value = "classpath:application.properties")
public class InternalResourceViewResolverfactory {

	@Autowired
	private Environment environment;

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix(environment.getProperty("prefix"));
		viewResolver.setSuffix(environment.getProperty("suffix"));
		return viewResolver;

	}

}
