package com.example.zuulProxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.zuulProxy.filters.ErrorFilter;
import com.example.zuulProxy.filters.PostFilter;
import com.example.zuulProxy.filters.PreFilter;
import com.example.zuulProxy.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyApplication.class, args);
	}

	@Bean
	public PreFilter preFIlter() {
		return new PreFilter();
	} 
	@Bean
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}
	
}

