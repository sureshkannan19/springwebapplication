package com.sk;

import com.sk.configuration.MyTestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringwebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		start(args);
	}

	public static ConfigurableApplicationContext start(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringwebApplication.class, args);
		System.out.println("Started application ");
		MyTestBean mtb = (MyTestBean) context.getBean("myBean");
		mtb.testService.print();
		return context;
	}

	public static void stop(ConfigurableApplicationContext configurableApplicationContext) {
		configurableApplicationContext.close();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.profiles("default");
		return builder.sources(SpringwebApplication.class);
	}
}


