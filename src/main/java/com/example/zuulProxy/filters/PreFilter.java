package com.example.zuulProxy.filters;

import com.netflix.zuul.ZuulFilter;

public class PreFilter extends ZuulFilter {

	@Override
	  public String filterType() {
	    return "pre";
	  }
	 
	  @Override
	  public int filterOrder() {
	    return 1;
	  }
	 
	  @Override
	  public boolean shouldFilter() {
	    return true;
	  }
	 
	  @Override
	  public Object run() {
	    	 
	    System.out.println("Inside Pre Filter");
	    return null;
	  }
}
