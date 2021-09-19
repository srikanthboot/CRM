package com.srikanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class CrmApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}

	@Bean
	public LocaleChangeInterceptor localeChange() {
		LocaleChangeInterceptor  interceptor=new LocaleChangeInterceptor();
		interceptor.setParamName("language");
		return interceptor;
	}
	
	@Bean
	public ReloadableResourceBundleMessageSource  messageSource() {
		ReloadableResourceBundleMessageSource source=new ReloadableResourceBundleMessageSource();
		source.setBasenames("classpath:messages", "classpath:i18n");
		return source;
	}
	
	@Bean
	public SessionLocaleResolver  localeResolver() {
		return new SessionLocaleResolver();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChange()).addPathPatterns("/login**");
	}
	
}
